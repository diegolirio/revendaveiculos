<div ng-init="getMarca()">  
	
	<h3 class="text-info" >Cadastro de Marcas</h3>
	 
	 <form ng-submit="save()" class="form-horizontal" >
	 
		<div class="control-group">
			<label class="control-label">ID:</label>
			<div class="controls" >
				<input type="text" ng-model="marca.id" class="input-small" required disabled ng-show="isUpdate" />
			</div>
		</div>	 

		<div class="control-group">
			<label class="control-label">Descricao:</label>
			<div class="controls" >
				<input type="text" ng-model="marca.descricao" class="input-small" required />
			</div>
		</div>	 
	 
		<img src="{{marca.urlImage}}" class="img-responsive" ng-show="isUpdate">	 
	 
	 	<br/>
	 
		<div class="form-actions">
			<button type="submit" class="btn btn-success">Salvar</button>
			<a href="#/marca/uploadImage/{{marca.id}}" class="btn btn-info" ng-show="isUpdate">Alterar Imagem</a>
			<a href="#/marca/get/list" class="btn btn-default">Voltar</a> 
			
			<a class="btn btn-danger pull-right" ng-click="del()" ng-show="isUpdate">Excluir</a>  
		</div>
			 
	 </form>
	
</div>	