<jsp:include page="./header.jsp" />

<div class="limiter">
	<div class="container-login100">
		<div class="wrap-login100">

			<form class="login100-form validate-form" method="post"
				action="login">
				<span class="login100-form-title p-b-26">
					<div>Welcome to Todo Task Management</div>
				</span> <span class="login100-form-title p-b-48"> <i
					class="zmdi zmdi-font"></i>
				</span>

				<div class="wrap-input100">${errorMessage }</div>
				<div class="wrap-input100 validate-input"
					data-validate="Valid email is: a@b.c">
					<input class="input100" type="text" name="name"> <span
						class="focus-input100" data-placeholder="UserName"></span>
				</div>

				<div class="wrap-input100 validate-input"
					data-validate="Enter password">
					<span class="btn-show-pass"> <i class="zmdi zmdi-eye"></i>
					</span> <input class="input100" type="password" name="password"> <span
						class="focus-input100" data-placeholder="Password"></span>
				</div>

				<div class="container-login100-form-btn">
					<div class="wrap-login100-form-btn">
						<div class="login100-form-bgbtn"></div>
						<button class="login100-form-btn">Login</button>
					</div>
				</div>

				<!-- 	<div class="text-center p-t-115">
						<span class="txt1">
							Don’t have an account?
						</span>

						<a class="txt2" href="#">
							Sign Up
						</a>
					</div> -->
			</form>
		</div>
	</div>
</div>
<jsp:include page="./footer.jsp" />
