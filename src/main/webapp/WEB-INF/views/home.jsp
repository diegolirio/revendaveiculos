<aside ng-controller="HomeController as homeCtrl" class="right-side" >
	
	<h2>Veiculos <small>( {{homeCtrl.veiculos.length}} )</small></h2>

	<div class="row">
	
	     <div ng-repeat="v in homeCtrl.veiculos" class="col-lg-3 col-sm-6 col-md-6 col-xs-12">
	         <!-- Primary box -->
	         <div class="box box-solid box-primary">
	             <div class="box-header">
	                 <h3 class="box-title">{{v.versao.modelo.marca.descricao}} {{v.versao.modelo.descricao}}</h3>
	                 <div class="box-tools pull-right">
	                 </div>
	             </div>
	             <div class="box-body">
			             <img src="{{v.urlFotoPrincipal}}" alt="{{v.versao.modelo.marca.descricao}} {{v.versao.modelo.descricao}}" class="img-rounded">
			             <div class="caption">
			                 <h3>{{v.versao.modelo.marca.descricao}} {{v.versao.modelo.descricao}} {{v.versao.descricao}} {{v.versao.anoModelo}}</h3>
<!-- 			                 <p>...</p> -->
			                 <p><a href="#" class="btn btn-warning">mais detalhes...</a> 
			             </div>
	             </div><!-- /.box-body -->
	         </div><!-- /.box -->
	     </div><!-- /.col -->	
	   
     
     </div>
	

</aside>
