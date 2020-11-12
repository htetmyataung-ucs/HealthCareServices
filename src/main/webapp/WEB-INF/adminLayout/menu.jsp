 <%@ include file="/WEB-INF/common/include.jsp"%>
 <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
    <ul class="app-menu">
        <li><a class="app-menu__item active" href="<c:url value='/admin'/>"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>
       <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-building-o"></i><span class="app-menu__label">City/TownShip</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
             <li><a class="treeview-item" href="<c:url value='/admin/city_list'/>"><i class="icon fa fa-share"></i> City</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/townshipList'/>"><i class="icon fa fa-share"></i> Township</a></li>
          </ul>
        </li>
        <li><a class="app-menu__item " href="<c:url value='/admin/medicalshop_list'/>"><i class="app-menu__icon fa fa-medkit"></i><span class="app-menu__label">Medical Shop</span></a></li>

        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-hospital-o"></i><span class="app-menu__label">Hospital</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
             <li><a class="treeview-item" href="<c:url value='/admin/hospitalcategory_list'/>"><i class="icon fa fa-share"></i> Hospital Category</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/hospitaltype_list'/>"><i class="icon fa fa-share"></i> Hospital Type</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/hospital_list'/>"><i class="icon fa fa-share"></i> Hospital</a></li>
             <li><a class="treeview-item" href="<c:url value='/admin/hospitaldetail_list'/>"><i class="icon fa fa-share"></i> Hospital Detail</a></li>
          </ul>
        </li>
        
         <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-puzzle-piece"></i><span class="app-menu__label">Speciality</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
             <li><a class="treeview-item" href="<c:url value='/admin/speciality_list'/>"><i class="icon fa fa-share"></i>Speciality</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/hospitalspecial_list'/>"><i class="icon fa fa-share"></i> Hospital Speciality</a></li>
          </ul>
        </li>
        
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user-md"></i><span class="app-menu__label">Doctor</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
             <li><a class="treeview-item" href="<c:url value='/admin/doctor_list'/>"><i class="icon fa fa-share"></i>Doctor</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/hospitaldoctorlist'/>"><i class="icon fa fa-share"></i> Hospital Doctor</a></li>
          </ul>
        </li>
       
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-file-pdf-o"></i><span class="app-menu__label">Article</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
             <li><a class="treeview-item" href="<c:url value='/admin/article_list'/>"><i class="icon fa fa-share"></i>Article</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/articledetail_list'/>"><i class="icon fa fa-share"></i>Article Detail</a></li>
          </ul>
        </li>
        
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-heartbeat"></i><span class="app-menu__label">Service</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
             <li><a class="treeview-item" href="<c:url value='/admin/serviceList'/>"><i class="icon fa fa-share"></i>Service</a></li>
            <li><a class="treeview-item" href="<c:url value='/admin/hospitalServiceList'/>"><i class="icon fa fa-share"></i>HospitalService</a></li>
          </ul>
        </li>
        
        <li><a class="app-menu__item " href="<c:url value='/admin/reviews_list'/>"><i class="app-menu__icon fa fa-comments-o"></i><span class="app-menu__label">Reviews</span></a></li>
       </ul>
    </aside>