package com.huaweicloud.cs.v1.test

import akka.actor.ActorSystem
import com.huaweicloud.cs.v1.JobApi
import com.huaweicloud.cs.v1.client.{ApiInvoker, ApiRequest, ApiResponse}
import com.huaweicloud.cs.v1.model.QueryJobListResponse
import org.scalatest.{FlatSpec, Matchers}

import scala.concurrent.Await
import scala.concurrent.duration._

class JobApiSpec extends FlatSpec with Matchers {
  "Query Job API" should "return job list" in {
    implicit val system = ActorSystem("api-actor")
    val request: ApiRequest[QueryJobListResponse] = JobApi.getJobs("720a49ba899a436388216eda3245365e", next = Some(true), showDetail = Some(false), limit = Some(10), order = Some("desc"))
    val f = ApiInvoker().execute(request)
    val ret: ApiResponse[QueryJobListResponse] = Await.result(f, 15.second)
    println(ret.code)
    println(ret.headers)
    println(ret.content)
  }
}
