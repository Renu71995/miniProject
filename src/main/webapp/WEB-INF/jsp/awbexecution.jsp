<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<Html>

<Head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>Shipment/Consignment Details Tab</title>
<style>
.center {
	padding: 100px 30px 30px 30px;
	border: 3px solid black;
	text-align: center;
}

.left {
	padding: 15px 0;
	text-align: left;
}

.right {
	float: right;
}

.thick {
	border-top: 3px solid black;
	margin-left: 0;
	margin-right: 0;
	width: 100%;
}

.round {
	border: 2px solid black;
	border-radius: 12px;
	width: 40%;
	Text-align: left;
	float: left;
	padding-left: 25px;
}

.inner {
	border: 2px solid black;
	/* width: 95.5%; */
	float: center;
	border-radius: 2px;
	padding: 30px 30px 30px 30px;
}

.divclass {
	padding-top: 50px;
	padding-bottom: 50px;
}

.round1 {
	border: 2px solid black;
	border-radius: 12px;
	padding: 25px;
	/* width: 95.5%; */
	float: center;
}

.center2 {
	padding: 20px 20px 20px 20px;
	border-collapse: separate;
	border-spacing: 0 15px;
	text-align: center;
	display: flex;
	justify-content: space-around;
}

.center1 {
	border-collapse: separate;
	border-spacing: 0 15px;
	column-gap: 20px;
	text-align: center;
}

.minusbutton {
	border-radius: 50%;
	border: none;
	font-size: 20px;
	font-weight: bold;
	color: white;
}

.plusbutton {
	border-radius: 50%;
	border: none;
	font-size: 20px;
	color: white;
}
</style>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
	crossorigin="anonymous"></script>
<script language="javascript">
    
        function addShipmentRow(tableid) {
          var table = document.getElementById(tableid);
    
          var rowCount = table.rows.length;
          var row = table.insertRow(rowCount);
    
                     var cell1 = row.insertCell(0);
                    var element1 = document.createElement("input");
                    element1.type = "checkbox";
                    element1.name="chkbox[]";
                    cell1.appendChild(element1);
        
                    var cell2 = row.insertCell(1);
                    var element2 = document.createElement("input");
                    element2.type = "text";
                    element2.name = "txtbox[]";
                    cell2.appendChild(element2);
                    // cell2.innerHTML = rowCount + 1;
        
                    var cell3 = row.insertCell(2);
                    var element3 = document.createElement("input");
                    element3.type = "text";
                    element3.name = "txtbox[]";
                    cell3.appendChild(element3);
    
                     var cell4 = row.insertCell(3);
                    var element4 = document.createElement("input");
                    element4.type = "text";
                    element4.name = "txtbox[]";
                    cell4.appendChild(element4);
    
                     var cell5 = row.insertCell(4);
                    var element5 = document.createElement("input");
                    element5.type = "text";
                    element5.name = "txtbox[]";
                    cell5.appendChild(element5);
    
                     var cell6 = row.insertCell(5);
                    var element6 = document.createElement("input");
                    element6.type = "text";
                    element6.name = "txtbox[]";
                    cell6.appendChild(element6);
    
        }  
    
        function deleteShipmentRow(tableid) {
          try {
            var table = document.getElementById(tableid);
            var rowCount = table.rows.length;
    
            for (var i = 0; i < rowCount; i++) {
              var row = table.rows[i];
              var chkbox = row.cells[0].childNodes[0];
              if (null != chkbox && true == chkbox.checked) {
                if (rowCount <= 1) {
                  alert("Cannot delete all the rows.");
                  break;
                }
                table.deleteRow(i);
                rowCount--;
                i--;
              }
    
    
            }
          } catch (e) {
            alert(e);
          }
        }
    
     function addRow(tableid) {
    
          var table = document.getElementById(tableid);
    
          var rowCount = table.rows.length;
          var row = table.insertRow(rowCount);
    
            var cell1 = row.insertCell(0);
            var element1 = document.createElement("input");
            element1.type = "checkbox";
            element1.name="chkbox[]";
            cell1.appendChild(element1);
    
            var cell2 = row.insertCell(1);
            var element2 = document.createElement("input");
            element2.type = "text";
            element2.name = "txtbox[]";
            element2.style.width = "98%";
            cell2.appendChild(element2);
            // cell2.innerHTML = rowCount + 1;
    
            var cell3 = row.insertCell(2);
            var element3 = document.createElement("input");
            element3.type = "text";
            element3.name = "txtbox[]";
            element3.style.width = "101%";
            cell3.appendChild(element3);
    
              var cell4 = row.insertCell(3);
            var element4 = document.createElement("input");
            element4.type = "text";
            element4.name = "txtbox[]";
            cell4.appendChild(element4);
    
              var cell5 = row.insertCell(4);
            var element5 = document.createElement("input");
            element5.type = "text";
            element5.name = "txtbox[]";
            cell5.appendChild(element5);
    
              var cell6 = row.insertCell(5);
            var element6 = document.createElement("input");
            element6.type = "text";
            element6.name = "txtbox[]";
            cell6.appendChild(element6);
    
            var cell7 = row.insertCell(6);
            var element7 = document.createElement("input");
            element7.type = "text";
            element7.name = "txtbox[]";
            cell7.appendChild(element7);
    
            var cell8 = row.insertCell(7);
            var element8 = document.createElement("input");
            element8.type = "text";
            element8.name = "txtbox[]";
            cell8.appendChild(element8);
        }
    
        function deleteRow(tableid) {
          try {
            var table = document.getElementById(tableid);
            var rowCount = table.rows.length;
    
            for (var i = 0; i < rowCount; i++) {
              var row = table.rows[i];
              var chkbox = row.cells[0].childNodes[0];
              if (null != chkbox && true == chkbox.checked) {
                if (rowCount <= 1) {
                  alert("Cannot delete all the rows.");
                  break;
                }
                table.deleteRow(i);
                rowCount--;
                i--;
              }
            }
          } catch (e) {
            alert(e);
          }
        }
    
      </script>

</Head>

<Body>
	<div class="center" id="outermostDiv">
	 <form:form action="/awbexecution" method="get"
		modelAttribute="bookingWrapper" class="inner">

			<label for="awbn">AWB Number:</label>
		 <form:input type="text" id="awbn" name="awbn" maxlength="11" size="11"
			path="basicBookingDetails.awbNumber" />
			 <label for="ubr">UBR
				Number:</label>
				<form:input type="text" id="ubrn" name="ubrn" path="basicBookingDetails.ubrNumber" />
			 	<input type="submit" class="btn btn-primary" value="List">
			<input type="submit" class="btn btn-danger" value="Clear">

		</form:form>

	<%-- 	<form:form action="/awbexecution" method="get"
			modelAttribute="bookingWrapper" class="center">
			<label for="awbn">AWB Number:</label>
			<form:input type="text" id="awbn" name="awbn"
				path="basicBookingDetails.awbNumber" />
			<label for="ubr">UBR Number:</label>
			<form:input type="text" id="ubrn" name="ubrn"
				path="basicBookingDetails.ubrNumber" />
			<input type="submit" class="btn btn-primary" value="List">
			<input type="submit" class="btn btn-danger" value="Clear">
	</form:from>	 --%>
	<form:form action="/awbexecution/1" modelAttribute="bookingWrapper"  method="POST"  class="inner" name="form1">
			<hr class="thick">

			<div class="divclass" id="originDiv">

				<label for="origin">Origin:</label>
				<form:input type="text" id="origin" name="origin"
					path="basicBookingDetails.origin" />

				<label for="destination">Destination:</label>
				<form:input type="text" id="destination" name="destination"
					path="basicBookingDetails.destination"></form:input>

				<label for="ServiceClass">Service Cargo Class:</label>
				<form:select name="sclass" id="sclass"
					path="basicBookingDetails.serviceClass">
					<option value="FreeCharge">Free of Charge</option>
					<option value="Comat">Comat</option>

				</form:select>


				<label for="SCC">SCC:</label>
				<form:input path="basicBookingDetails.scc" type="text" id="scc"
					name="scc" />

				<label for="Code">Code:</label> 
				<form:input path="basicBookingDetails.agentCode" type="text" id="code"
					name="code" />

			</div>
			<!-- End of originDiv -->
	

		<div id="shipperconsignmentDiv" class="inner">
			<p class="left">
				<strong>SHIPPER/CONSIGNMENT DETAILS</strong>
			</p>

			<div id="outerDiv"
				style="display: flex; justify-content: space-around;">

				<div class="round" id="innerDiv">
					<p class="left">
						<strong>SHIPPER DETAILS</strong>
					</p>


					<label for="Code">Code:</label> <br>
					<form:input type="text" id="code" name="code"
						path="shipperDetails.shipperCode"></form:input>
					<br> <label for="Name">Name:</label> <br>
					<form:input type="text" id="name" name="name"
						path="shipperDetails.shipperName"></form:input>
					<br> <label for="Address">Address:</label> <br>
					<form:input type="text" id="address" name="address"
						path="shipperDetails.shipperAddress"></form:input>
					<br> <label for="City">City:</label> <br>
					<form:input type="text" id="city" name="city"
						path="shipperDetails.shipperCity"></form:input>
					<br> <label for="Country">Country:</label> <br>
					<form:input type="text" id="country" name="country"
						path="shipperDetails.shipperCountry"></form:input>
					<br>


				</div>
				<!-- End of innerDiv -->


				<div class="round" id="innerDiv2">

					<p class="left">
						<strong>CONSIGNMENT DETAILS</strong>
					</p>
					<label for="Code">Code:</label> <br>
					<form:input type="text" id="code1" name="code1"
						path="consignmentDetails.consignmentCode"></form:input>
					<br> <label for="Name">Name:</label> <br>
					<form:input type="text" id="name1" name="name1"
						path="consignmentDetails.consignmentName"></form:input>
					<br> <label for="Address">Address:</label> <br>
					<form:input type="text" id="address1" name="address1"
						path="consignmentDetails.consignmentAddress"></form:input>
					<br> <label for="City">City:</label> <br>
					<form:input type="text" id="city1" name="city1"
						path="consignmentDetails.consignmentCity"></form:input>
					<br> <label for="Country">Country:</label> <br>
					<form:input type="text" id="country1" name="country1"
						path="consignmentDetails.consignmentCountry"></form:input>
					<br>

				</div>
				<!-- End of innerDiv2 -->

			</div>
			<!-- End of outerDiv -->

		</div>
		<!-- End of shipperconsignmentDiv -->

		<!-- Keerthana -->

		<div class="inner" id="outerDiv1">
			<p class="left">
				<strong>SHIPMENT DETAILS</strong>
			</p>
			<table class="center2">
				<tr>
					<td><label for="unit">Weight Unit </label> <select name="unit"
						id="unit">
							<option value="pound">Pound</option>
							<option value="kilo">Kilogram</option>
					</select> <label for="unit">Volume Unit </label> <select name="unit"
						id="unit">
							<option value="feet">Cubic feet</option>
							<option value="meters">Cubic meters</option>
					</select>
						</form></td>
			<!-- 		<td><INPUT type="button" id="addshipment"
						class="plusbutton btn btn btn-primary" value="+"
						onclick="addShipmentRow('dataTableShipment')" /> <INPUT
						type="button" id="deleteShipment"
						class="minusbutton btn btn-danger" value="-"
						onclick="deleteShipmentRow('dataTableShipment')" /></td> -->
				</tr>
				<tr>
					<td>
						<table id="dataTableShipment" width="350px" border="1">
							<tr>
								<td></td>
								<td>Pieces</td>
								<td>Weight</td>
								<td>Volume</td>
								<td>Cmdty Code</td>
								<td>ULD Type</td>

							</tr>
							<tr>

								<TD><INPUT type="checkbox" name="chk" /></TD>
								<td><form:input type="text" id="pieces" name="pieces"
										path="bulkBooking.pieceNumber"></form:input></td>
								<td><form:input type="text" id="weight" name="weight"
										path="bulkBooking.weight"></form:input></td>
								<td><form:input type="text" id="volume" name="volume"
										path="bulkBooking.volume"></form:input></td>
								<td><form:input type="text" id="cmdty" name="cmdty"
										path="bulkBooking.commodityCode"></form:input></td>
								<td><input type="text" id="uld" name="uld"></td>

							</tr>
						</table>
					</td>
				</tr>
			</table>
		<%-- 	<div class="round1" id="innerDiv1">
				<form>
					<label for="Stated Pieces">Stated Pieces</label> <input
						name="statedPieces" id="statedPieces" type="number" /> <label
						for="Stated Weight">Stated Weight</label> <input
						name="statedWeight" id="statedWeight" type="number" /> <label
						for="Stated Volume">Stated Volume</label> <input
						name="statedVolume" id="statedVolume" type="number" /> <label
						for="SLAC Pieces">SLAC Pieces</label> <input name="slacPieces"
						id="slacPieces" type="number" /> <br /> <br /> <label
						for="Shipment Description">Shipment Description</label>
					<textarea rows="4" cols="30" name="desc" form="usrform">
            </textarea>
				</form>
			</div> --%>
			<!-- End of Keerthana code-->
			<!-- Aishwarya -->
			<br>
			<div class="inner">
				<p class="left">
					<strong>DIMENSION</strong>
				</p>
				<table>
					<tr>
					<!-- 	<td style="text-align: right; padding: 7px;"><INPUT
							type="button" class="plusbutton btn btn-primary" value="+"
							onclick="addRow('dataTable3')" /> <INPUT type="button"
							class="minusbutton btn btn-danger" value="-"
							onclick="deleteRow('dataTable3')" /></td> -->
					</tr>
					<tr>
						<td>
							<table id="dataTable3" border="1">
								<tr>
									<td></td>
									<td>No. of pcs</td>
									<td>Weight(Pound)</td>
									<td>Volume(Cubic feet)</td>
								</tr>
								<tr>
									<TD><INPUT type="checkbox" name="chk" /></TD>
									<td><form:input type="text" id="pcs" name="pcs" size="7%" path="bulkBooking.pieceNumber" />
									</td>
									<td><form:input type="text" id="weight" name="weight"
										size="15%" path="bulkBooking.weight" /></td>
									<td><form:input type="text" id="volume" name="volume" path="bulkBooking.volume" />
									</td>
									
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</div>
		</div>

		<div class="divclass" id="buttonDiv">

			<input type="submit" class="btn btn-warning" value="Execute">
			<input type="submit" class="btn btn-info" value="Print"> <input
				type="submit" class="btn btn-success" value="Save">

		</div>
		</form:form>
		<!-- End of buttonnDiv -->


	</div>
	<!-- End of outermostDiv -->
</Body>
</Html>