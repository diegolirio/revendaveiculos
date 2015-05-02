<aside ng-controller="VeiculoViewController as vvCtrl" class="right-side" >
	
	<br/>
	
	<div class="row">
	
		  <div class="col-md-4">
              <div class="box box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">{{vvCtrl.veiculo.versao.modelo.marca.descricao}} {{vvCtrl.veiculo.versao.modelo.descricao}} <small ng-repeat="f in vvCtrl.veiculo.fotos">dfv {{f.uri}}</small> </h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li ng-repeat="f in vvCtrl.fotos" data-target="#carousel-example-generic" data-slide-to="{{ $index }}" class="{{ $index == 0 ? 'active' : '' }}"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div ng-repeat="f in vvCtrl.fotos" class="item {{ $index == 0 ? 'active' : '' }}">
                        <img src="{{f.uri}}" alt="First slide" class="img-responsive">
                        <div class="carousel-caption">
                          foto {{ $index+1 }}
                        </div>
                      </div>
                    </div>
                    <a class="left carousel-control" href="?#carousel-example-generic" data-slide="prev">
                      <span class="fa fa-angle-left"></span>
                    </a>
                    <a class="right carousel-control" href="?#carousel-example-generic" data-slide="next">
                      <span class="fa fa-angle-right"></span>
                    </a>
                  </div>
                </div><!-- /.box-body -->
              </div><!-- /.box -->	
            </div><!-- /.col -->	
            <div class="col-md-8">
            	<h1 class="text-primary">{{vvCtrl.veiculo.versao.modelo.marca.descricao}} {{vvCtrl.veiculo.versao.modelo.descricao}} <small><small>( id. {{vvCtrl.veiculo.id}} )</small></small></h1>
            	<ul>
            		<li>{{vvCtrl.veiculo.versao.descricao}}</li>
            		<li>{{vvCtrl.veiculo.versao.motor}}</li>
            		<li>{{vvCtrl.veiculo.versao.anoFabricacao}}/{{vvCtrl.veiculo.versao.anoModelo}}</li>
            		<li>{{vvCtrl.veiculo.km}} KM</li>
            		<li>{{vvCtrl.veiculo.cor.descricao}}</li>
            	</ul>
            	
            	<p><span ng-repeat="op in vvCtrl.opcionais">{{op.opcional.descricao}} - </span></p>
            	
            </div>
	
     </div><!-- /.row -->	

</aside>
 