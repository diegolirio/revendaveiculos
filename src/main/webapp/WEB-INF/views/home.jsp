<aside ng-controller="HomeController as homeCtrl" class="right-side" >
	
	<h2>Veiculos ( {{homeCtrl.veiculos.length}} )</h2>
	<ul>
		<li ng-repeat="v in homeCtrl.veiculos"><a href="#/veiculo/{{v.id}}">{{v.placa}}</a></li>
	</ul>

	<a href="#/new">New</a>
	
	<a href="#/marca/get/list">Marcas</a>
	
	<div class="row">
	
	     <div class="col-lg-3 col-sm-6 col-md-6 col-xs-12">
	         <!-- Primary box -->
	         <div class="box box-solid box-primary">
	             <div class="box-header">
	                 <h3 class="box-title">Pegeout 308</h3>
	                 <div class="box-tools pull-right">
<!-- 	                     <button class="btn btn-primary btn-sm" data-widget="collapse"><i class="fa fa-minus"></i></button> -->
<!-- 	                     <button class="btn btn-primary btn-sm" data-widget="remove"><i class="fa fa-times"></i></button> -->
	                 </div>
	             </div>
	             <div class="box-body">
			             <img src="${pageContext.request.contextPath}/static/images/veiculos/34266268_1.jpeg" alt="Sample Image" class="img-rounded">
			             <div class="caption">
			                 <h3>Pegeout 308 Quiksilver 2015</h3>
			                 <p>Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula. Cras justo odio, dapibus ac facilisis in quam.</p>
			                 <p><a href="#" class="btn btn-primary">mais detalhes...</a> 
<!-- 			                 <a href="#" class="btn btn-default">Download</a></p> -->
			             </div>
	             </div><!-- /.box-body -->
	         </div><!-- /.box -->
	     </div><!-- /.col -->	
	   
     
     </div>
	

</aside>
