<aside ng-controller="VeiculoViewController as vvCtrl" class="right-side" >
	
	<br/>
	
	<div class="row">
	
		  <div class="col-md-6">
              <div class="box box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">{{vvCtrl.veiculo.versao.modelo.marca.descricao}} {{vvCtrl.veiculo.versao.modelo.descricao}} <small ng-repeat="f in vvCtrl.veiculo.fotos">dfv {{f.uri}}</small> </h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                      <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
                      <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
                    </ol>
                    <div class="carousel-inner">
                      <div ng-repeat="f in vvCtrl.veiculo.fotos" class="item active">
                        <img src="{{f.uri}}" alt="First slide">
                        <div class="carousel-caption">
                          First Slide
                        </div>
                      </div>
<!--                       <div class="item"> -->
<!--                         <img src="http://placehold.it/900x500/3c8dbc/ffffff&text=I+Love+Bootstrap" alt="Second slide"> -->
<!--                         <div class="carousel-caption"> -->
<!--                           Second Slide -->
<!--                         </div> -->
<!--                       </div> -->
<!--                       <div class="item"> -->
<!--                         <img src="http://placehold.it/900x500/f39c12/ffffff&text=I+Love+Bootstrap" alt="Third slide"> -->
<!--                         <div class="carousel-caption"> -->
<!--                           Third Slide -->
<!--                         </div> -->
<!--                       </div> -->
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
	
     </div><!-- /.row -->	
	

</aside>
 