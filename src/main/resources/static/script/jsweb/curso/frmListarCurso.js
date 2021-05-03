$(document).on("click", "#btnagregarcurso", function() {
	$("#txtnomcurso").val("");
	$("#txtcredcurso").val("");
	$("#hddidcurso").val("0");
	$("#modalcurso").modal("show");
});

$(document).on("click", ".btnactualizarcurso", function() {
	$("#txtnomcurso").val($(this).attr("data-nomcurso"));
	$("#txtcredcurso").val($(this).attr("data-credcurso"));
	$("#hddidcurso").val($(this).attr("data-codcurso"));
	$("#modalcurso").modal("show");
});

$(document).on("click", "#btnregistrarcurso", function() {
	if ($("#hddidcurso").val() === "0") {
		$.ajax({
			type: "POST",
			contentType: "application/json",
			url: "/Curso/registrarCurso",
			data: JSON.stringify({
				nomcurso: $("#txtnomcurso").val(),
				credito: $("#txtcredcurso").val()
			}),
			success: function(resultado) {
				if (resultado.respuesta) {
					alert(resultado.mensaje);
					ListarCursos();
				} else {
					alert(resultado.mensaje);
				}
			}
		});
	} else {
		$.ajax({
			type: "POST",
			contentType: "application/json",
			url: "/Curso/registrarCurso",
			data: JSON.stringify({
				idcurso: $("#hddidcurso").val(),
				nomcurso: $("#txtnomcurso").val(),
				credito: $("#txtcredcurso").val()
			}),
			success: function(resultado) {
				if (resultado.respuesta) {
					alert(resultado.mensaje);
					ListarCursos();
				} else {
					alert(resultado.mensaje);
				}
			}
		});
	}
	$("#modalcurso").modal("hide");
});
function ListarCursos(){
	$.ajax({
		type: "GET",
		url: "/Curso/listarCursos",
		dataType: "json",
		success:function(resultado){
			$("#tblcurso > tbody").html("");
			$.each(resultado, function(index, value){
				$("#tblcurso > tbody").append("<tr>"+
					"<td>" + value.idcurso + "</td>"+
					"<td>" + value.nomcurso + "</td>"+
					"<td>" + value.credito + "</td>"+
					"<td><button type='button' class='btn btn-info btnactualizarcurso' "+
					" data-codcurso='"+value.idcurso+"'"+
					" data-nomcurso='"+value.nomcurso+"'"+
					" data-credcurso='"+value.credito+"'>Actualizar</button>"+
					"</td>"+
					"<td><button type='button' class='btn btn-danger btneliminarcurso' "+
					" data-codcurso='"+value.idcurso+"'"+
					" data-nomcurso='"+value.nomcurso+"'>Eliminar</button>"+
					"</td></tr>")
			})
						
		}
	})
}

$(document).on("click", ".btneliminarcurso", function() {
	//alert($(this).attr("data-codcurso"));
	$("#mensajeeliminar").text("¿Está seguro de eliminar el curso: " +
		$(this).attr("data-nomcurso") + "?");
	$("#hddidcursoeliminar").val($(this).attr("data-codcurso"));
	$("#modaleliminarcurso").modal("show");
});

$(document).on("click", "#btneliminarcurso", function() {

});


