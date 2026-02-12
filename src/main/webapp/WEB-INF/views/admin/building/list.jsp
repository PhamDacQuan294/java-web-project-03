<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<div class="main-content">
  <div class="main-content-inner">
    <div class="breadcrumbs" id="breadcrumbs">
      <script type="text/javascript">
        try {
          ace.settings.check('breadcrumbs', 'fixed')
        } catch (e) {
        }
      </script>

      <ul class="breadcrumb">
        <li>
          <i class="ace-icon fa fa-home home-icon"></i>
          <a href="#">Home</a>
        </li>
        <li class="active">Dashboard</li>
      </ul><!-- /.breadcrumb -->

      <div class="nav-search" id="nav-search">
        <form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input"
                         autocomplete="off"/>
									<i class="ace-icon fa fa-search nav-search-icon"></i>
								</span>
        </form>
      </div><!-- /.nav-search -->
    </div>

    <div class="page-content">
      <div class="ace-settings-container" id="ace-settings-container">
        <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
          <i class="ace-icon fa fa-cog bigger-130"></i>
        </div>

        <div class="ace-settings-box clearfix" id="ace-settings-box">
          <div class="pull-left width-50">
            <div class="ace-settings-item">
              <div class="pull-left">
                <select id="skin-colorpicker" class="hide">
                  <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                  <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                  <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                  <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                </select>
              </div>
              <span>&nbsp; Choose Skin</span>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar"/>
              <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar"/>
              <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs"/>
              <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl"/>
              <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container"/>
              <label class="lbl" for="ace-settings-add-container">
                Inside
                <b>.container</b>
              </label>
            </div>
          </div><!-- /.pull-left -->

          <div class="pull-left width-50">
            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover"/>
              <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact"/>
              <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
            </div>

            <div class="ace-settings-item">
              <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight"/>
              <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
            </div>
          </div><!-- /.pull-left -->
        </div><!-- /.ace-settings-box -->
      </div><!-- /.ace-settings-container -->

      <div class="page-header">
        <h1>
          Dashboard
          <small>
            <i class="ace-icon fa fa-angle-double-right"></i>
            overview &amp; stats
          </small>
        </h1>
      </div><!-- /.page-header -->

      <div class="row">
        <div class="col-xs-12">

          <div class="widget-box">
            <div class="widget-header">
              <h5 class="widget-title">Tìm kiếm</h5>
              <div class="widget-toolbar">
                <a href="#" data-action="collapse">
                  <i class="ace-icon fa fa-chevron-up"></i>
                </a>
              </div>
            </div>

            <div class="widget-body">
              <div class="widget-main">
                <form id="listForm" class="form-horizontal">
                  <!-- Row 1 -->
                  <div class="row">
                    <div class="col-xs-6">
                      <label>Tên tòa nhà</label>
                      <input class="form-control"/>
                    </div>
                    <div class="col-xs-6">
                      <label>Diện tích sàn</label>
                      <input type="number" class="form-control" name="floorArea"/>
                    </div>
                  </div>

                  <div class="space-12"></div>

                  <!-- Row 2 -->
                  <div class="row">
                    <div class="col-xs-2">
                      <label>Chọn Quận</label>
                      <select path="district" class="form-control">
                        <option value="">--- Chọn quận ---</option>
                        <option>Q1</option>
                      </select>
                    </div>
                    <div class="col-xs-5">
                      <label>Phường</label>
                      <input type="text" class="form-control" name="ward" value=""/>
                    </div>
                    <div class="col-xs-5">
                      <label>Đường</label>
                      <input type="text" class="form-control" name="street" value=""/>
                    </div>
                  </div>

                  <div class="space-12"></div>

                  <!-- Row 3 -->
                  <div class="row">
                    <div class="col-xs-4">
                      <label>Số tầng hầm</label>
                      <input type="number" class="form-control" name="numberOfBasement" value=""/>
                    </div>
                    <div class="col-xs-4">
                      <label>Hướng</label>
                      <input type="text" class="form-control" name="direction" value=""/>
                    </div>
                    <div class="col-xs-4">
                      <label>Hạng</label>
                      <input type="text" class="form-control" name="level" value=""/>
                    </div>
                  </div>

                  <div class="space-12"></div>

                  <!-- Row 4 -->
                  <div class="row">
                    <div class="col-xs-3">
                      <label>Diện tích từ</label>
                      <input type="number" class="form-control" name="areaFrom" value=""/>
                    </div>
                    <div class="col-xs-3">
                      <label>Diện tích đến</label>
                      <input type="number" class="form-control" name="areaTo" value=""/>
                    </div>
                    <div class="col-xs-3">
                      <label>Giá thuê từ</label>
                      <input type="number" class="form-control" name="rentPriceFrom" value=""/>
                    </div>
                    <div class="col-xs-3">
                      <label>Giá thuê đến</label>
                      <input type="number" class="form-control" name="rentPriceTo" value=""/>
                    </div>
                  </div>

                  <div class="space-12"></div>

                  <!-- Row 5 -->
                  <div class="row">
                    <div class="col-xs-5">
                      <label>Tên quản lý</label>
                      <input type="text" class="form-control" name="managerName" value=""/>
                    </div>
                    <div class="col-xs-5">
                      <label>SDT quản lý</label>
                      <input type="text" class="form-control" name="managerPhone" value=""/>
                    </div>
                    <div class="col-xs-2">
                      <label>Nhân viên</label>
                      <select path="staffId" class="form-control">
                        <option value="">--- Nhân viên ---</option>
                        <option>NV1</option>
                      </select>
                    </div>
                  </div>

                  <div class="space-12"></div>
                  <div class="space-12"></div>

                  <!-- Row 7 -->
                  <div class="row">
                    <div class="col-xs-12">
                      <button type="button" class="btn btn-info" id="btnSearchBuilding">
                        <i class="ace-icon fa fa-search bigger-110"></i> Tìm kiếm
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>

          <div class="space-12"></div>
          <div class="space-12"></div>

          <div class="clearfix">
            <div class="pull-right">
              <a href="/admin/building-edit">
                <button class="btn btn-primary">Thêm tòa nhà</button>
              </a>
              <button class="btn btn-danger" id="btnDeleteBuilding">Xóa tòa nhà</button>
            </div>
          </div>

          <div class="space-12"></div>
          <div class="space-12"></div>

          <!-- Table -->
          <div class="row">
            <div class="col-xs-12">
              <table id="tableList" class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                  <th class="center">
                    <label class="pos-rel">
                      <input type="checkbox" name="checkList" value="" class="ace"/>
                      <span class="lbl"></span>
                    </label>
                  </th>
                  <th>Tên tòa nhà</th>
                  <th>Địa chỉ</th>
                  <th>Số tầng hầm</th>
                  <th>Tên quản lý</th>
                  <th>SĐT quản lý</th>
                  <th>D.Tích sàn</th>
                  <th>D.Tích trống</th>
                  <th>D.Tích thuê</th>
                  <th>Phí môi giới</th>
                  <th>Thao tác</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${records}">
                  <tr>
                    <td class="center">
                      <label class="pos-rel">
                        <input type="checkbox" name="checkList" value="" class="ace">
                        <span class="lbl"></span>
                      </label>
                    </td>

                    <td>
                      <a href="#">${item.name}</a>
                    </td>

                    <td>
                      <a href="#">${item.address}</a>
                    </td>

                    <td>
                      <a href="#">ok</a>
                    </td>

                    <td>
                      <a href="#">${item.managerName}</a>
                    </td>

                    <td>
                      <a href="#">${item.managerPhoneNumber}</a>
                    </td>

                    <td>
                      <a href="#">${item.floorArea}</a>
                    </td>


                    <td class="hidden-480">3,330</td>

                    <td>
                      <a href="#">${item.rentArea}</a>
                    </td>

                    <td class="hidden-480">
                      <span class="label label-sm label-warning">Expiring</span>
                    </td>

                    <td>
                      <div class="hidden-sm hidden-xs btn-group">
                        <button class="btn btn-xs btn-success" title="Giao toa nha">
                          <i class="ace-icon fa fa-pencil bigger-120"></i>
                        </button>

                        <a class="btn btn-xs btn-info" title="Sua toa nha" href="ok">
                          <i class="ace-icon fa fa-pencil bigger-120"></i>
                        </a>

                        <button class="btn btn-xs btn-danger" title="Xoa toa nha">
                          <i class="ace-icon fa fa-trash-o bigger-120"></i>
                        </button>
                      </div>
                    </td>
                  </tr>
                </c:forEach>
                </tbody>
              </table>
            </div>
          </div>

        </div><!-- /.col -->
      </div><!-- /.row -->
    </div><!-- /.page-content -->
  </div>
</div><!-- /.main-content -->
</body>
</html>
