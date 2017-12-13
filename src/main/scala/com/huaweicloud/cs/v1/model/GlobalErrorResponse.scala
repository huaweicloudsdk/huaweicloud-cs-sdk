/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.v1.model

import com.huaweicloud.cs.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class GlobalErrorResponse (
  /* 错误消息码 */
  errorId: Option[String],
  /* 错误消息名 */
  errorName: Option[String],
  /* 错误原因 */
  errorCause: Option[String],
  /* 针对错误的建议 */
  errorSuggestion: Option[String],
  /* 扩展信息, JSON格式 */
  errorJsonOpt: Option[String],
  /* 错误发生的时间, 毫秒数 */
  errorTime: Option[Long]
) extends ApiModel


