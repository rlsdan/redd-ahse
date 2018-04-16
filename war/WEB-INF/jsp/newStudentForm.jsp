<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  	<head>
		<title>New Student Form</title>
		<style type="text/css">
			.error {
				color:red
			}
		</style>
		<script type="text/javascript">
			function validateMath(){
    			var idMath=document.getElementById("math");
				if (idMath.value=="" || idMath.value==null){
	   			alert("Please enter Math grade");
          		idMath.focus();
           		return false;
				}
    			return true;
			}

 			function validateEnglish(){
    			var idEnglish=document.getElementById("english");
				if (idEnglish.value=="" || idEnglish.value==null){
	   			alert("Please enter English grade");
           		idEnglish.focus();
           		return false;
				}
    			return true;
			}

 			function validateScience(){
    			var idScience=document.getElementById("science");
				if (idScience.value=="" || idScience.value==null){
	   			alert("Please enter Science grade");
          		idScience.focus();
           		return false;
				}
    			return true;
			}

			function computeAvg(){
				var n1=document.getElementById("math").value;
				var n2=document.getElementById("english").value;
				var n3=document.getElementById("science").value;
				var avg=document.getElementById("average");
				var sum;
				sum=parseFloat(n1)+parseFloat(n2)+parseFloat(n3);
				avg.value=sum/3;				
			}
		</script>
	</head>
	
  	<body>
  		<h2>New Student</h2>
		<div>			
			<form:form commandName="student" method="post">
				<div>
					<label for="id_firstName">First name : <span style="color: red" title="required">*</span></label>
					<form:input path="firstName" /><form:errors path="firstName" cssClass="error" />
				</div>
				<div>
					<label for="id_middleName">Middle name : <span style="color: red" title="required">*</span></label>
					<form:input path="middleName" /><form:errors path="middleName" cssClass="error" />
				</div>
				<div>
					<label for="id_lastName">Last name : <span style="color: red" title="required">*</span></label>
					<form:input path="lastName" /><form:errors path="lastName" cssClass="error" />
				</div>
				<div>
					<label for="id_nickName">Nick name : </label>
					<form:input path="nickName" />
				</div>
				<div>
					<label for="id_gender">Gender : <span style="color: red" title="required">*</span></label>
					<form:select path="gender">
						<form:option value="-" label="-- Select one --" />
						<form:option value="m" label="Male" />
						<form:option value="f" label="Female" />
					</form:select>
					<form:errors path="gender" cssClass="error" />
				</div>
				<div>
					<label for="id_birthday">Birthday : <span style="color: red" title="required">*</span></label>
					<form:input path="birthday" /><span><em>(MM-DD-YYYY)</em></span>
					<form:errors path="birthday" cssClass="error" />
				</div>
				<div>
					<label for="id_birthPlace">Birth place : </label>
					<form:input path="birthPlace" /><form:errors path="birthPlace" />
				</div>
				
				<br>
				
				<div>
					<span title="header"><strong>Contact Info</strong></span>
					<hr>
				</div>
				<div>
					<label for="id_telNo">Home phone : </label>
					<form:input path="telNo" />
				</div>
				<div>
					<label for="id_celNo">Mobile phone : </label>
					<form:input path="celNo" />
				</div>
				<div>
					<label for="id_email">Email address :</label>
					<form:input path="email" />
				</div>

				<br>

				<div>
					<span title="header"><strong>Home Address Info</strong></span>
					<hr>
				</div>
				<div>
					<label for="id_street">Street : <span style="color: red" title="required">*</span></label>
					<form:input path="street" size="50" /><form:errors path="street" cssClass="error" />
				</div>
				<div>
					<label for="id_district">District : </label>
					<form:input path="district" size="30" />
				</div>
				<div>
					<label for="id_city">City :<span style="color: red" title="required">*</span></label>
					<form:input path="city" size="30" /><form:errors path="city" cssClass="error" />
				</div>
				<div>
					<label for="id_province">Province : <span style="color: red" title="required">*</span></label>
					<form:input path="province" size="30" /><form:errors path="province" cssClass="error" />
				</div>
				<div>
					<label for="id_zip">Zip code : </label>
					<form:input path="zip" />
				</div>
				
				<br>
				
				<div>
					<span title="header"><strong>Guardian Info</strong></span>
					<hr>
				</div>
				<div>
					<label for="id_guardian">Guardian's name : </label>
					<form:input path="guardian" />
				</div>
				<div>
					<label for="id_guardianContactNo">Guardian's phone : </label>
					<form:input path="guardianContactNo" />
				</div>

				<br>
				
				<div>
					<span title="header"><strong>Last School Attended Info</strong></span>
					<hr>
				</div>
				<div>
					<label for="id_school">School : <span style="color: red" title="required">*</span></label>
					<form:input path="school" size="50" /><form:errors path="school" cssClass="error" />
				</div>
				<div>
					<label for="id_year">Year graduated : <span style="color: red" title="required">*</span></label>
					<form:input path="year" size="5" /><form:errors path="year" cssClass="error" />
				</div>
				
				<br>
				
				<div>
					<label for="id_math">Math : <span style="color: red" title="required">*</span></label>
					<form:input path="math" size="5" />
					<form:errors path="math" cssClass="error" />
				</div>
				<div>
					<label for="id_science">Science : <span style="color: red" title="required">*</span></label>
					<form:input id="science" path="science" size="5" onfocus="validateMath()" />
					<form:errors path="science" cssClass="error" />
				</div>
				<div>
					<label for="id_english">English : <span style="color: red" title="required">*</span></label>
					<form:input id="english" path="english" size="5" onfocus="validateScience()" onblur="computeAvg()" />
					<form:errors path="english" cssClass="error" />
				</div>
				<div>
					<label for="id_average">Gen. Average : <span style="color: red" title="required">*</span></label>
					<form:input id="average" path="average" size="5" onfocus="validateEnglish()" />
					<form:errors path="average" cssClass="error" />
				</div>
				
				<br>
						
				<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
				<input type="submit" class="button" name="_eventId_submit" value="Submit">
				<input type="submit" class="button" name="_eventId_cancel" value="Cancel">			
			</form:form>
		</div>
	</body>
</html>

<!-- TODO : PROVIDE A JS FOR PICTURE -->
<!-- TODO : PROVIDE A JS CALENDAR WITH DATE OBJECTS -->
<!-- TODO : PROVIDE A JS FOR TEXT FORM DEFAULT LABEL -->
<!-- TODO : MAKE EACH SCORE BE ENTERED IN A SINGLE TABLE "GradeRecord" -->	
