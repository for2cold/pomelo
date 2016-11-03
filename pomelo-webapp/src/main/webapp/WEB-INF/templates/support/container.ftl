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