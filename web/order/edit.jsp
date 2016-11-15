<%--
  Created by IntelliJ IDEA.
  User: godlikehzj
  Date: 2016/11/13
  Time: 下午10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/taglibs.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <form class="form-horizontal form-label-left input_mask" target="_parent" id="add_customer" action="${ctx}/order/add.do" method="post">
      <div class="x_panel">
        <div class="x_title">
          <h2>客户信息 <small>different form elements</small></h2>
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
        <br />

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">姓名 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control" required="required" placeholder="" name="cname">
            </div>
          </div>
          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">电话 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control" required="required" placeholder="" name="phone">
            </div>
          </div>
          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">地区</label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select class="select2_single form-control" tabindex="-1" name="area">
                <option></option>
                <option value="AK">Alaska</option>
                <option value="HI">Hawaii</option>
                <option value="CA">California</option>
              </select>
            </div>
          </div>
          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">地址
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control" placeholder="" name="addr">
            </div>
          </div>
      </div>
    </div>

      <div class="x_panel">
        <div class="x_title">
          <h2>订单信息 <small>different form elements</small></h2>
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
          <br />

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">系列</label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select class="form-control" name="series">
                <c:forEach var="series" items="${seriesList}">
                  <option value="${series}">${series}</option>
                </c:forEach>
                <option>Choose option</option>
                <option>Option one</option>
                <option>Option two</option>
                <option>Option three</option>
                <option>Option four</option>
              </select>
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">口味</label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select class="form-control" name="subType">
                <option>Choose option</option>
                <option>Option one</option>
                <option>Option two</option>
                <option>Option three</option>
                <option>Option four</option>
              </select>
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">配送人</label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <select class="form-control" name="mname">
                <c:forEach var="manager" items="${managers}">
                  <option value="${manager.name}">${manager.name}</option>
                  </c:forEach>
                <option>Choose option</option>
                <option>Option one</option>
                <option>Option two</option>
                <option>Option three</option>
                <option>Option four</option>
              </select>
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">数量 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
              <input type="text" class="form-control" required="required" placeholder="" name="num">
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">开始日期 <span class="required">*</span></label>
            <div class="col-md-3">
              <fieldset>
                <div class="control-group">
                  <div class="controls">
                    <div class="col-md-11 xdisplay_inputx form-group has-feedback">
                      <input type="text" class="form-control has-feedback-left" name="startTime" id="single_cal1" placeholder="First Name" aria-describedby="inputSuccess2Status2">
                      <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                      <span id="inputSuccess2Status1" class="sr-only">(success)</span>
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12">结束日期 <span class="required">*</span></label>
            <div class="col-md-3">
              <fieldset>
                <div class="control-group">
                  <div class="controls">
                    <div class="col-md-11 xdisplay_inputx form-group has-feedback">
                      <input type="text" class="form-control has-feedback-left" name="endTime" id="single_cal2" placeholder="First Name" aria-describedby="inputSuccess2Status">
                      <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                      <span id="inputSuccess2Status2" class="sr-only">(success)</span>
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>


          <div class="ln_solid"></div>
          <div class="form-group">
            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
              <button type="submit" class="btn btn-primary">Cancel</button>
              <button type="submit" class="btn btn-success" id="c_submit">Submit</button>
            </div>
          </div>
        </div>
      </div>
    </form>
  </div>
</div>
<script type="text/javascript">
  <%--$('#c_submit').bind('click',function(){--%>
    <%--&lt;%&ndash;校验全部&ndash;%&gt;--%>

    <%--$('#add_customer').submit();--%>
  <%--});--%>
  <%--var options = {--%>
    <%--dataType:'json',--%>
    <%--success : dataTest.toBack--%>
  <%--};--%>
  <%--$('#dataTest_edit_form_id').ajaxForm(options);--%>
  $(document).ready(function() {
    $('#single_cal1').daterangepicker({
      singleDatePicker: true,
      singleClasses: "picker_1"
    }, function (start, end, label) {
      console.log(start.toISOString(), end.toISOString(), label);
    });

    $('#single_cal2').daterangepicker({
      singleDatePicker: true,
      singleClasses: "picker_2"
    }, function (start, end, label) {
      console.log(start.toISOString(), end.toISOString(), label);
    });
  });
</script>
