<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <th class="column-title">奶品系列 </th>
            <th class="column-title">奶品名称</th>
            <th class="column-title">奶品规格</th>
            <th class="column-title">奶品价格</th>
            <th class="column-title no-link last"><span class="nobr">操作</span>
            </th>
            <th class="bulk-actions" colspan="7">
              <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
            </th>
          </tr>
          </thead>

          <tbody>
          <c:forEach var="production" items="${plist}">
            <tr class="even pointer">
              <td class="a-center ">
                <input type="checkbox" class="flat" name="table_records">
              </td>
              <td class=" ">${production.series}</td>
              <td class=" ">${production.subType}</td>
              <td class=" ">${production.capacity}</td>
              <td class=" ">${production.price}</td>
              <td class=" last"><a href="#">操作</a>
              </td>
            </tr>
          </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>

