/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.v1.model

import com.huaweicloud.cs.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JobTemplateRequest (
  /* 模板名称 */
  name: Option[String],
  /* 模板描述 */
  desc: Option[String],
  /* Stream SQL语句, 至少包含source, query, sink三个部分 */
  sqlBody: Option[String]
) extends ApiModel


