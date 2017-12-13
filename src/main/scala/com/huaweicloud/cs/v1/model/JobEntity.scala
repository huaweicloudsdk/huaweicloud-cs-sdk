/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.v1.model

import com.huaweicloud.cs.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JobEntity (
  /* 作业ID */
  jobId: Long,
  /* 作业名称 */
  name: Option[String],
  /* 作业描述 */
  desc: Option[String],
  /* 作业创建时间 */
  createTime: Long,
  /* 作业启动时间, 0尚未启动 */
  startTime: Option[Long],
  /* 作业状态码 */
  statusCode: Int,
  /* 作业状态名称 */
  statusName: Option[String],
  /* 作业状态描述 */
  statusDesc: Option[String],
  /* 作业运行时长，单位ms */
  duration: Option[Long],
  /* 作业提交者 */
  provider: Option[String],
  /* 预留的集群资源ID, 当前用户有该预留资源的使用权限 */
  clusterId: Option[Long],
  /* Stream SQL语句分 */
  sqlBody: Option[String],
  /* CloudStream Service Jar job Size */
  jarBody: Option[String],
  /* 作业运行模式，共享或者独享模式 */
  runMode: Option[JobEntityEnums.RunMode],
  /* 用户为作业选择的SPU数量 */
  spuNumber: Option[Int],
  /* 用户设置的作业并行数 */
  parallelNumber: Option[Int],
  /* 是否开启作业自动快照功能, true开启, false关闭, 默认false */
  checkpointEnabled: Option[Boolean],
  /* 快照模式, 两种可选, exactly_once和at_least_once */
  checkpointMode: Option[JobEntityEnums.CheckpointMode],
  /* checkpoint_enabled==true是, 用户授权保存快照的OBS路径 */
  obsBucket: Option[String],
  /* 快照时间间隔, 单位为秒 */
  checkpointInterval: Option[Int]
) extends ApiModel

object JobEntityEnums {

  type RunMode = RunMode.Value
  type CheckpointMode = CheckpointMode.Value
  object RunMode extends Enumeration {
    val SharedCluster = Value("shared_cluster")
    val ExclusiveCluster = Value("exclusive_cluster")
  }

  object CheckpointMode extends Enumeration {
    val ExactlyOnce = Value("exactly_once")
    val AtLeastOnce = Value("at_least_once")
  }

}

