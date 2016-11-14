<%@ include file="../common/taglibs.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: godlikehzj
  Date: 2016/11/3
  Time: 下午11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-12 col-sm-12 col-xs-12">
  <div class="x_panel">
    <div class="x_title">
      <h2>Button Sizes</h2>
      <ul class="nav navbar-right panel_toolbox">
        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Settings 1</a>
            </li>
            <li><a href="#">Settings 2</a>
            </li>
          </ul>
        </li>
        <li><a class="close-link"><i class="fa fa-close"></i></a>
        </li>
      </ul>
      <div class="clearfix"></div>
    </div>
    <div class="x_content">
      <div class="buttons">
        <!-- Standard button -->

        <button type="button" class="btn btn-success btn-lg" onclick="addOrder()">新建订单</button>

      </div>
    </div>

  </div>

  <div class="x_panel">
    <div class="x_title">
      <h2>Table design <small>Custom design</small></h2>
      <ul class="nav navbar-right panel_toolbox">
        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Settings 1</a>
            </li>
            <li><a href="#">Settings 2</a>
            </li>
          </ul>
        </li>
        <li><a class="close-link"><i class="fa fa-close"></i></a>
        </li>
      </ul>
      <div class="clearfix"></div>
    </div>

    <div class="x_content">

      <p>Add class <code>bulk_action</code> to table for bulk actions options on row select</p>

      <div class="table-responsive">
        <table class="table table-striped jambo_table bulk_action">
          <thead>
          <tr class="headings">
            <th>
              <input type="checkbox" id="check-all" class="flat">
            </th>
            <th class="column-title">配送人</th>
            <th class="column-title">姓名</th>
            <th class="column-title">地区</th>
            <th class="column-title">住址</th>
            <th class="column-title">电话</th>
            <th class="column-title">奶品系列</th>
            <th class="column-title">奶品名称</th>
            <th class="column-title">数量</th>
            <th class="column-title">订奶起始日期</th>
            <th class="column-title">订奶到期日期</th>
            </th>
            <th class="bulk-actions" colspan="7">
              <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
            </th>
          </tr>
          </thead>

          <tbody>
          <c:forEach var="order" items="${orderLists}">
            <tr class="even pointer">
              <td class="a-center ">
                <input type="checkbox" class="flat" name="table_records">
              </td>
              <td class=" ">${order.mname}</td>
              <td class=" ">${order.cname}</td>
              <td class=" ">${order.area}</td>
              <td class=" ">${order.addr}</td>
              <td class=" ">${order.phone}</td>
              <td class=" ">${order.series}</td>
              <td class=" ">${order.subType}</td>
              <td class=" ">${order.num}</td>
              <td class=" "><fmt:formatDate value="${order.startTime}" pattern="yyyy-MM-dd"/></td>
              <td class=" "><fmt:formatDate value="${order.endTime}" pattern="yyyy-MM-dd"/></td>
            </tr>
          </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>


