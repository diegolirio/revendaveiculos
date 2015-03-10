
        <!-- header logo: style can be found in header.less -->
        <header class="header" ng-hide="hideMenu">
            <a href="${pageContext.request.contextPath}" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
                Veículos
                <img src="${pageContext.request.contextPath}/static/core/img/159.GIF" ng-show="showLoaderFlag"/>
            </a>
            
            
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span> 
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
						
						<li ng-hide="usuarioCtrl.isLoggedIn"><a href="#/login"><i class="fa fa-sign-in"></i> Login</a></li>						
						 
	                        <!-- User Account: style can be found in dropdown.less -->
	                    <li class="dropdown user user-menu" ng-show="usuarioCtrl.isLoggedIn">
	                            <a href="javascript:undefined" class="dropdown-toggle" data-toggle="dropdown">
	                                <i class="glyphicon glyphicon-user"></i>
	                                <span>{{usuarioCtrl.usuario.nome}} <i class="caret"></i></span>
	                            </a>
	                            
	                            <ul class="dropdown-menu">
	                                <!-- User image -->
	                                <li class="user-header bg-light-blue">
	                                    <img src="${pageContext.request.contextPath}/static/adminlte-master/img/avatar-215x215.png" class="img-circle" alt="User Image" />
	                                    <p>
	                                        {{usuarioCtrl.usuario.nome}}
											<!-- <small>Member since Nov. 2012</small> -->
	                                    </p>
	                                </li>
	                                <!-- Menu Body -->
	                                <li class="user-body">
	                                    <div class="col-xs-4 text-center">
	<!--                                         <a href="#">Followers</a> -->
	                                    </div>
	                                    <div class="col-xs-4 text-center">
	                                        <a href="#/votacao/my">Minhas votações</a>
	                                    </div>
	                                    <div class="col-xs-4 text-center">
	<!--                                         <a href="#">Friends</a> -->
	                                    </div>
	                                </li>
	                                <!-- Menu Footer-->
	                                <li class="user-footer">
	                                    <div class="pull-left">
	                                        <a href="#/usuario/cadastro/{{usuarioCtrl.usuario.nome}}" class="btn btn-default btn-flat">Perfil</a>
	                                    </div>
	                                    <div class="pull-right">
	                                        <a href ng-click="usuarioCtrl.logout()" class="btn btn-default btn-flat">Sair</a>
	                                    </div>
	                                </li>
	                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

