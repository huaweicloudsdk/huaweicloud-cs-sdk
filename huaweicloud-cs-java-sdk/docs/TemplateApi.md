# TemplateApi

All URIs are relative to *https://cs.cn-north-1.myhuaweicloud.com/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createJobTemplate**](TemplateApi.md#createJobTemplate) | **POST** /{X-Project-Id}/job_template | create the job template
[**deleteJobTemplate**](TemplateApi.md#deleteJobTemplate) | **DELETE** /{X-Project-Id}/job_template/{template_id} | 删除作业模板
[**getJobTemplates**](TemplateApi.md#getJobTemplates) | **GET** /{X-Project-Id}/job_templates | query CloudStream Service job templates


<a name="createJobTemplate"></a>
# **createJobTemplate**
> Boolean createJobTemplate(xProjectId, body)

create the job template

Create on job template from CloudStream Service

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
JobTemplateRequest body = new JobTemplateRequest(); // JobTemplateRequest | Create job template request
try {
    Boolean result = apiInstance.createJobTemplate(xProjectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#createJobTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **body** | [**JobTemplateRequest**](JobTemplateRequest.md)| Create job template request |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJobTemplate"></a>
# **deleteJobTemplate**
> Boolean deleteJobTemplate(xProjectId, templateId)

删除作业模板

当前模板被引用也允许删除模板

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long templateId = 789L; // Long | 
try {
    Boolean result = apiInstance.deleteJobTemplate(xProjectId, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#deleteJobTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **templateId** | **Long**|  |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobTemplates"></a>
# **getJobTemplates**
> List&lt;JobTemplate&gt; getJobTemplates(xProjectId, cursor, limit, order)

query CloudStream Service job templates

### Example
```java
// Import classes:
//import com.huaweicloud.cs.java.v1.client.ApiException;
//import com.huaweicloud.cs.java.v1.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String xProjectId = "xProjectId_example"; // String | project id, 用于不同project取token.
Long cursor = 789L; // Long | 作业模板ID
Integer limit = 56; // Integer | 查询条数限制
String order = "desc"; // String | 查询结果排序, 升序和降序两种可选
try {
    List<JobTemplate> result = apiInstance.getJobTemplates(xProjectId, cursor, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#getJobTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xProjectId** | **String**| project id, 用于不同project取token. |
 **cursor** | **Long**| 作业模板ID |
 **limit** | **Integer**| 查询条数限制 |
 **order** | **String**| 查询结果排序, 升序和降序两种可选 | [default to desc] [enum: desc, asc]

### Return type

[**List&lt;JobTemplate&gt;**](JobTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
