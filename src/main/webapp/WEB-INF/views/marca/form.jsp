<!-- Pagina de Cadastro -->

<aside ng-controller="MarcaFormController as marcaFormCtrl" class="right-side" >

	<div class="container">
	
		<h3 class="text-info" >Cadastro de Marcas</h3>
		 
		 <form ng-submit="marcaFormCtrl.save()" class="form-horizontal" >
		 
			<div class="control-group">
				<label class="control-label">ID:</label>
				<div class="controls" >
					<input type="text" ng-model="marcaFormCtrl.marca.id" class="input-small" required disabled ng-show="marcaFormCtrl.isUpdate" />
				</div>
			</div>	 
	
			<div class="control-group">
				<label class="control-label">Descricao:</label>
				<div class="controls" >
					<input type="text" ng-model="marcaFormCtrl.marca.descricao" class="input-small" required />
				</div>
			</div>	 
		 
		 	<br/>
<!-- 		 	<a ng-href   -->
			<img src="{{marcaFormCtrl.marca.urlImage}}" class="img-responsive"  width="150" ng-show="marcaFormCtrl.isUpdate"> 	 
		 	<br/>
		 
			<div class="form-actions">
				<button type="submit" class="btn btn-success">Salvar</button>
				<a href="#/marca/uploadImage/{{marca.id}}" class="btn btn-info" ng-show="isUpdate">Alterar Imagem</a>
				<a href="#/marca/get/list" class="btn btn-default">Voltar</a> 
				
				<a class="btn btn-danger" ng-click="del()" ng-show="isUpdate">Excluir</a>  
			</div>
				 
		 </form>
	</div>
	
</aside>	