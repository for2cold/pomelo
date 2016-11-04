<#global base=(springMacroRequestContext.getContextPath())?if_exists >
<#global libVersion="1.0" >
<#global version="1.0" >
<#macro html title="" version="" scripts="">
<!DOCTYPE html>
<html>
    <head>
        <title>${title!"欢迎使用"}</title>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="${base}/css/bootstrap.min.css?v=${libVersion!}" />
        <link rel="stylesheet" href="${base}/css/mower.min.css?v=${libVersion!}" />
        <link rel="stylesheet" href="${base}/css/app.css?v=${libVersion!}" />
        <script src="${base}/js/libs/themes.js?v=${libVersion!}" type="text/javascript"></script>
        <!-- [if lt IE 9] >
            <script src="${base}/js/libs/html5shiv.min.js?v=${libVersion!}"></script>
            <script src="${base}/js/libs/respond.min.js?v=${libVersion!}"></script>
        <![endif]-->
        <script type="text/javascript">var base = '${base!}';</script>
    </head>
    <body>
        <!-- Loading Container -->
        <!--<div class="loading-container">
            <div class="fa fa-spinner fa-pulse loader"></div>
        </div>-->
        <!--  /Loading Container -->
        <#include "support/header.ftl"/>
        <!-- BEGIN CONTAINER -->
        <div class="mu-main-container container-fluid">
            <!-- BEGIN SIDEBAR -->
            <div class="mu-sidebar-wrapper">
                <div class="mu-sidebar" id="sidebar">
                    <!-- Page Sidebar Header-->
                    <div class="sidebar-header-wrapper">
                        <input type="text" class="searchinput">
                        <i class="searchicon fa fa-search"></i>
                        <div class="searchhelper">Search Reports, Charts, Emails or Notifications</div>
                    </div>
                    <!-- /Page Sidebar Header -->
                    <!-- Sidebar Menu -->
                    <ul class="nav sidebar-menu" style="">
                    </ul>
                    <!-- /Sidebar Menu -->
                </div>
            </div>
            <!-- END SIDEBAR -->
            <!-- BEGIN CONTENT -->
            <div class="mu-content-wrapper">
                <div class="mu-content">
                    <!-- BEGIN BREADCRUMB -->
                    <div class="mu-content-header">
                        <div class="mu-breadcrumb-wrapper">
                            <ul class="breadcrumb" data-target="#mainContent">
                            </ul>
                        </div>
                        <div class="header-buttons">
                            <a class="sidebar-toggler" href="#">
                                <i class="fa fa-arrows-h"></i>
                            </a>
                            <a class="refresh" id="refresh-toggler" href="">
                                <i class="glyphicon glyphicon-refresh"></i>
                            </a>
                            <a class="favorite" id="favorite-toggler" href="#">
                                <i class="fa fa-star fa-lg"></i>
                            </a>
                        </div>
                    </div>
                    <!-- END BREADCRUMB-->
                    <!-- BEGIN CONTENT INNER -->
                    <div class="mu-content-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div id="mainContent">
                                    <#nested />
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END CONTENT -->
        </div>
        <!-- END CONTAINER -->
        <#include "support/footer.ftl"/>
        <!-- BEGIN CORE PLUGINS -->
        <script src="${base}/js/libs/jquery-1.11.1.js?v=${libVersion!}" type="text/javascript"></script>
        <script src="${base}/js/libs/json2.js?v=${libVersion!}" type="text/javascript"></script>
        <script src="${base}/js/libs/bootstrap.js?v=${libVersion!}" type="text/javascript"></script>
        <script src="${base}/js/libs/knockout-3.1.0-min.js?v=${libVersion!}" type="text/javascript"></script>
        <script src="${base}/js/libs/jquery.tmpl.min.js?v=${libVersion!}" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="${base}/js/libs/mower.js?v=${libVersion!}" type="text/javascript"></script>
        <script src="${base}/js/libs/app.js?v=${libVersion!}" type="text/javascript"></script>
        <script src="${base}/js/libs/query.js?v=${libVersion!}" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
        <script src="${base}/js/libs//prettify.js?v=${libVersion!}"></script>
        <#if scripts??>
            <#list scripts?split(",") as js>
                <#if js != "">
                    <script type="text/javascript" src="${js}?v=${version!'1.0.0'}"></script>
                </#if>
            </#list>
        </#if>
    </body>
    </html>
    </#macro>