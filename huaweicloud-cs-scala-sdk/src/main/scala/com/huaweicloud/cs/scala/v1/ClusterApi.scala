/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package com.huaweicloud.cs.scala.v1

import com.huaweicloud.cs.scala.v1.model.GlobalErrorResponse
import com.huaweicloud.cs.scala.v1.model.GlobalResponse
import com.huaweicloud.cs.scala.v1.model.NewReservedClusterRequest
import com.huaweicloud.cs.scala.v1.model.QueryClusterResponse
import com.huaweicloud.cs.scala.v1.model.QueryClustersResponse
import com.huaweicloud.cs.scala.v1.model.QueryJobListResponse
import com.huaweicloud.cs.scala.v1.model.QueryUserQuotaResponse
import com.huaweicloud.cs.scala.v1.model.QueryUserQuotasResponse
import com.huaweicloud.cs.scala.v1.model.UpdateClusterRequest
import com.huaweicloud.cs.scala.v1.model.UpdateUserQuotaRequest
import com.huaweicloud.cs.scala.v1.client._
import com.huaweicloud.cs.scala.v1.client.CollectionFormats._
import com.huaweicloud.cs.scala.v1.client.ApiKeyLocations._

object ClusterApi {

  /**
   * 
   * Expected answers:
   *   code 200 : GlobalResponse (预留集群创建成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param body 创建一个新的预留集群, 请求参数为json格式
   */
  def createReservedCluster(xProjectId: String, body: NewReservedClusterRequest): ApiRequest[GlobalResponse] =
    ApiRequest[GlobalResponse](ApiMethods.POST, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/reserved_cluster", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[GlobalResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 
   * Expected answers:
   *   code 200 : GlobalResponse (预留集群删除成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param clusterId 预留集群ID
   */
  def deleteReservedCluster(xProjectId: String, clusterId: Long): ApiRequest[GlobalResponse] =
    ApiRequest[GlobalResponse](ApiMethods.DELETE, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/reserved_cluster/{cluster_id}", "application/json")
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("cluster_id", clusterId)
      .withSuccessResponse[GlobalResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 
   * Expected answers:
   *   code 200 : QueryClusterResponse (预留集群信息查询成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param clusterId 预留集群ID.
   */
  def describeReservedCluster(xProjectId: String, clusterId: Long): ApiRequest[QueryClusterResponse] =
    ApiRequest[QueryClusterResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/reserved_cluster/{cluster_id}", "application/json")
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("cluster_id", clusterId)
      .withSuccessResponse[QueryClusterResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 预留集群作业列表查询
   * 
   * Expected answers:
   *   code 200 : QueryJobListResponse (查询作业列表成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param clusterId 预留集群ID
   * @param name 作业名
   * @param status 作业状态码, 请参考CloudStream文档
   * @param showDetail 是否返回作业详情信息
   * @param cursor 作业ID游标
   * @param next 是否向下翻页
   * @param limit 返回的数据条数
   * @param order 查询结果排序, 升序和降序两种可选
   */
  def getClusterJobs(xProjectId: String, clusterId: Long, name: Option[String] = None, status: Option[String] = None, showDetail: Option[Boolean], cursor: Option[Long] = None, next: Option[Boolean], limit: Option[Int], order: Option[String]): ApiRequest[QueryJobListResponse] =
    ApiRequest[QueryJobListResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/reserved_cluster/{cluster_id}/jobs", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("status", status)
      .withQueryParam("show_detail", showDetail)
      .withQueryParam("cursor", cursor)
      .withQueryParam("next", next)
      .withQueryParam("limit", limit)
      .withQueryParam("order", order)
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("cluster_id", clusterId)
      .withSuccessResponse[QueryJobListResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 租户集群列表查询, 支持以下参数: name, status, cursor, next, limit, order. The cursor here is cluster id.
   * 
   * Expected answers:
   *   code 200 : QueryClustersResponse (查询租户下的预留集群列表成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param name 集群名
   * @param status 集群状态码, 请参考CloudStream文档
   * @param cursor 集群ID游标
   * @param next 是否向下翻页
   * @param limit 返回的数据条数
   * @param order 查询结果排序, 升序和降序两种可选
   */
  def getReservedClusters(xProjectId: String, name: Option[String] = None, status: Option[String] = None, cursor: Option[Long] = None, next: Option[Boolean], limit: Option[Int], order: Option[String]): ApiRequest[QueryClustersResponse] =
    ApiRequest[QueryClustersResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/reserved_clusters", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("status", status)
      .withQueryParam("cursor", cursor)
      .withQueryParam("next", next)
      .withQueryParam("limit", limit)
      .withQueryParam("order", order)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[QueryClustersResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 
   * Expected answers:
   *   code 200 : QueryUserQuotaResponse (查询指定用户配额信息成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param userId 用户ID
   */
  def getUserQuota(xProjectId: String, userId: String): ApiRequest[QueryUserQuotaResponse] =
    ApiRequest[QueryUserQuotaResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/user_quota/{user_id}", "application/json")
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("user_id", userId)
      .withSuccessResponse[QueryUserQuotaResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 租户下用户配额信息列表查询, 支持以下参数: name, order, cursor, next, limit. The cursor here is user id.
   * 
   * Expected answers:
   *   code 200 : QueryUserQuotasResponse (查询租户下的用户配额信息成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param name 用户名
   * @param cursor 用户ID游标
   * @param next 是否向下翻页
   * @param limit 返回的数据条数
   * @param order 查询结果排序, 升序和降序两种可选
   */
  def getUserQuotas(xProjectId: String, name: Option[String] = None, cursor: Option[String] = None, next: Option[Boolean], limit: Option[Int], order: Option[String]): ApiRequest[QueryUserQuotasResponse] =
    ApiRequest[QueryUserQuotasResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/user_quotas", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("cursor", cursor)
      .withQueryParam("next", next)
      .withQueryParam("limit", limit)
      .withQueryParam("order", order)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[QueryUserQuotasResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 
   * Expected answers:
   *   code 200 : GlobalResponse (预留集群更新成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param clusterId 预留集群ID
   * @param body 提交修改集群请求
   */
  def updateReservedCluster(xProjectId: String, clusterId: Long, body: UpdateClusterRequest): ApiRequest[GlobalResponse] =
    ApiRequest[GlobalResponse](ApiMethods.PATCH, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/reserved_cluster/{cluster_id}", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("cluster_id", clusterId)
      .withSuccessResponse[GlobalResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
        /**
   * 
   * Expected answers:
   *   code 200 : GlobalResponse (更新指定用户配额信息成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param userId 用户ID
   * @param body JSON格式的请求体
   */
  def updateUserQuota(xProjectId: String, userId: String, body: UpdateUserQuotaRequest): ApiRequest[GlobalResponse] =
    ApiRequest[GlobalResponse](ApiMethods.PATCH, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/user_quota/{user_id}", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("user_id", userId)
      .withSuccessResponse[GlobalResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
      

}
