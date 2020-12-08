$(function() {

	$("#mybutton").click(
			function(e) {
				e.preventDefault();
				$("#exportmanifestform").attr("method", "post");
				$("#exportmanifestform").attr("type", "post");
				$("#exportmanifestform").attr("action",
						"/exportmanifest/listshipments");
				$("#exportmanifestform").submit();
			})
});