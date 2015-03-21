<aside ng-controller="HomeController as homeCtrl" class="right-side" >
	
	<h2>Veiculos <small>( {{homeCtrl.veiculos.length}} )</small></h2>

	<div class="row">
	
	

            <div ng-repeat="v in homeCtrl.veiculos" class="col-md-3">
              <div class="box box-warning">
                <div class="box-header with-border">
                  <h3 class="box-title">{{v.versao.modelo.marca.descricao}} {{v.versao.modelo.descricao}}</h3>
                  <div class="box-tools pull-right">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div><!-- /.box-tools -->
                </div><!-- /.box-header -->
                <div class="box-body">
                  
                		 <a href="#/veiculo/{{v.id}}">
			             	<img src="{{v.urlFotoPrincipal}}" alt="{{v.versao.modelo.marca.descricao}} {{v.versao.modelo.descricao}}" class="img-rounded img-responsive">
			             </a>
			             <div class="caption">
			                 <h3>{{v.versao.modelo.marca.descricao}} {{v.versao.modelo.descricao}} {{v.versao.descricao}} {{v.versao.anoModelo}}</h3>
<!-- 			                 <p>...</p> -->
			                 <p><a href="#/veiculo/{{v.id}}" class="btn btn-warning">mais detalhes...</a> 
			             </div>
			             
                </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div><!-- /.col -->
            	   
     
     </div>
	

</aside>
