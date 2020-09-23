<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Todo</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of TODO's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
					<th width="30%">Title</th>
						<th width="30%">Description</th>
						<th width="20%">Target Date</th>
						<th width="20%">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
						<td>${todo.title}</td>
							<td>${todo.description}</td>
							<td><fmt:formatDate value="${todo.targetDate}"
									pattern="dd/MM/yyyy" /></td>
							<td><a type="button" class="btn btn-success"
								href="/update-todo?id=${todo.id}">Update</a>
							<%-- <a type="button"  class="btn btn-warning"
								href="/delete-todo?id=${todo.id}">Delete</a> --%>
								
								 <a type="button"  class="btn btn-warning" onClick="deleteList(${todo.id})"
								href="javascript:void(0)">Delete</a>
								</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>

<script>
	function deleteList(id){
		
		var r = confirm("Are you sure to delete current record?");
		if (r == true) {
			window.location.href="/delete-todo?id="+id;
		} else {
		 ///alert("Please Try Letter")
		}
	}

</script>
<%@ include file="common/footer.jspf"%>