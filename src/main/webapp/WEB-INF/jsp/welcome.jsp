<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="./header.jsp" />
<link rel="stylesheet" type="text/css" href="/static/style.css">
<div class="limiter">
	<div class="container-login100">
		<div class="wrap-login100" style="width: 1000px">
			<form method="post" action="newTask">
				<span class="login100-form-title p-b-16"> Create a new task </span>
				<div class="wrap-input100">
					<input class="input100" type="text" name="subject"
						autocomplete="off" /><span class="focus-input100"
						data-placeholder="Subject"></span>
				</div>
				<div class="wrap-input100">
					<textarea class="input100" name="description" rows="5" cols="100"></textarea>
					<span class="focus-input100" data-placeholder="Description"></span>
				</div>

				<div class="container-login100-form-btn">
					<div class="wrap-login100-form-btn" style="width: 25%">
						<div class="login100-form-bgbtn"></div>
						<button class="login100-form-btn">Save Task</button>
					</div>
				</div>

			</form>

			<c:if test="${fn:length(allTasks) > 0}">

				<br />
				<br />
				<hr />
				<br />
				<span class="login100-form-title p-b-16"> View Existing task
				</span>
				<div class="wrap-input100">
					Filter: <input type="radio" id="contactChoice1" name="contact"
						value="PENDING"> <label for="contactChoice1">PENDING</label>
					<input type="radio" id="contactChoice2" name="contact"
						value="COMPLETED"> <label for="contactChoice2">COMPLETED</label>
					<input type="radio" id="contactChoice3" name="contact" value="ALL">
					<label for="contactChoice3">All</label>
				</div>
				<div class="divTable">
					<div class="divTableBody">
						<div class="divTableRow">
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCell">Subject</div>
							<div class="divTableCell">Status</div>
							<div class="divTableCell">Description</div>
							<div class="divTableCell">Created At (MM/dd/yyyy)</div>
							<div class="divTableCell">Actions</div>
						</div>
						<c:forEach items="${allTasks }" var="task" varStatus="stat">
							<div class="divTableRow ALL ${task.status }">
								<div class="divTableCell">${stat.index + 1}.</div>
								<div class="divTableCell">${task.subject }</div>
								<div class="divTableCell">${task.status }</div>
								<div class="divTableCell">${task.description }</div>
								<div class="divTableCell"><fmt:formatDate pattern="MM/dd/yyyy" value="${task.creationDate.time }" />
								</div>
								<c:choose>
									<c:when test="${task.status == 'PENDING' }">
										<div class="divTableCell">
											<a class="hyperlink" href="deleteTask?id=${task.id}">Delete</a>&nbsp;
											<a class="hyperlink" href="completeTask?id=${task.id}">Mark
												Complete</a>
										</div>
									</c:when>
									<c:otherwise>
										<div class="divTableCell"></div>
									</c:otherwise>
								</c:choose>
							</div>
						</c:forEach>
					</div>
				</div>


			</c:if>
		</div>
	</div>
</div>
<br />
<hr />


<jsp:include page="./footer.jsp" />
