<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<body style="background-color: whitesmoke;">
	<div class="container-fluid p-0">
		<div class="container">

			<div class="row">
				<div class="col-lg-1"></div>
				<div class="col-lg-10"
					style="box-shadow: 0px 3px 3px #888888a2; background-color: white;">
					<div class="container p-0">
						<h2 class="mt-3 mb-3" style="font-size: 25px;">You can make
							Question and Answer</h2>
						<button data-toggle="modal" data-target="#myModal"
							style="font-weight: bold; font-size: 14px; color: black; border-radius: 5px; border: 1px solid gray;">Create
							Post</button>
						<!-- MODAL START -->
						<div class="container">
							<div class="modal fade" id="myModal" role="dialog">
								<div class="modal-dialog">

									<!-- Modal content-->
									<div class="modal-content">
										<div class="modal-header">
											<h4 class="modal-title">Create Post</h4>
											<button type="button" class="close" data-dismiss="modal">&times;</button>
										</div>
										<form action="/post" method="POST">
											<div class="modal-body">
												<!--  Description -->
												<div class="form-group">
													<label>Text your opinion!</label>
													<textarea id="editor" name="description"
														class="form-control"></textarea>
												</div>
												<script>
													tinymce
															.init({
																selector : 'textarea#editor',
																skin : 'bootstrap',
																plugins : 'lists, link, image, media',
																toolbar : 'h1 h2 bold italic strikethrough blockquote bullist numlist backcolor | link image media | removeformat help',
																menubar : false
															});
												</script>
											</div>
											<div class="modal-footer">
												<button type="submit"
													style="color: black; font-weight: bold; font-size: 14px; border-radius: 5px; border: 1px solid gray;">Insert</button>
												<button type="button"
													style="color: black; font-weight: bold; font-size: 14px; border-radius: 5px; border: 1px solid gray;"
													data-dismiss="modal">Close</button>
											</div>
										</form>
									</div>

								</div>
							</div>
						</div>
						<!--MODAL END-->
						<div class="row">
							<div class="col-lg-8 p-0 p-lg-3">

								<c:forEach items="${postList}" var="p">
									<div class="card mt-3" style="box-shadow: 0px 2px 2px #888888;">
										<div class="container" style="background-color: whitesmoke;">
											<div class="row">
												<div class="col-lg-2 col-3 col-md-3">
													<img src="resources/assets/img/gallery/team1.png"
														style="width: 50px; height: 50px; text-align: center; border-radius: 50%;"
														class="ml-1 mt-2 mb-2 mr-0">
												</div>
												<div class="col-lg-6 col-9 col-md-8">
													<label class="ml-0 mt-1 pt-4"
														style="font-size: 15px; font-weight: bold;">${p.userName }</label>
												</div>
											</div>
										</div>
										<div class="text-justify mt-3 mb-3 ml-4 mr-4">${p.description }</div>
										<div class="container" style="background-color: whitesmoke;">
											<div class="row mt-3 mb-2">

												<div class="col-lg-6 col-6"
													style="font-size: 14px; font-weight: bold;">
													<a href="#" style="color: black;"><i
														class="fa fa-comment-o"></i>&nbsp;&nbsp;<label>View
															Comment</label></a>
												</div>

												<div class="col-lg-6 col-6"
													style="font-size: 14px; font-weight: bold;">
													<a href="#" style="color: black;"><i
														class="fa fa-comment-o"></i>&nbsp;&nbsp;<label>Create
															Comment</label></a>
												</div>

											</div>
										</div>
									</div>
								</c:forEach>


							</div>
							<div class="col-lg-4">
								<h3 class="ml-3">Recent Posts</h3>
								<div class="container">

									<c:forEach items="${orderPostList}" var="op">
										<div class="card mb-2">
											<div class="container" style="background-color: whitesmoke;">
												<div class="row">
													<div class="col-lg-12">
														<label style="font-size: 15px; font-weight: bold;">${op.userName}</label>
													</div>
												</div>
											</div>
											<div class="text-justify m-2" style="font-size: 13px;">${op.description}</div>
										</div>
									</c:forEach>

								</div>
							</div>
						</div>

					</div>
				</div>
				<div class="col-lg-1"></div>
			</div>
		</div>
	</div>
</body>