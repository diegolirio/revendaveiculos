<aside ng-controller="HomeController as homeCtrl" class="right-side" >

  <div class="row">
    <div class="col-md-12">
      <div class="box box-solid">

        <div class="box-body">
          <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="?#carousel-example-generic" data-slide-to="0" class="active"></li>
              <li data-target="?#carousel-example-generic" data-slide-to="1" class=""></li>
              <li data-target="?#carousel-example-generic" data-slide-to="2" class=""></li>
            </ol>
            <div class="carousel-inner">
              <div class="item active">
                <img src="http://placehold.it/900x500/39CCCC/ffffff&text=I+Love+Bootstrap" alt="First slide" class="img-responsive">
                <div class="carousel-caption">
                  First Slide
                </div>
              </div>
              <div class="item">
                <img src="http://placehold.it/900x500/3c8dbc/ffffff&text=I+Love+Bootstrap" alt="Second slide" class="img-responsive">
                <div class="carousel-caption">
                  Second Slide
                </div>
              </div>
              <div class="item">
                <img src="http://placehold.it/900x500/f39c12/ffffff&text=I+Love+Bootstrap" alt="Third slide" class="img-responsive">
                <div class="carousel-caption">
                  Third Slide
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
  </div>
	
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
