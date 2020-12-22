<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<Html>

<Head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<title>Maintain Booking</title>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#shippingDate").datepicker();
	});
</script>
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

.inner {
	border: 2px solid black;
	padding: 30px 0px 30px 30px;
	float: center;
	border-radius: 2px;
}

.round {
	border: 2px solid black;
	border-radius: 12px;
	width: 48%;
	Text-align: left;
	float: left;
	padding-left: 25px;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 3px;
}

* {
	box-sizing: border-box;
}

.openBtn {
	display: flex;
	justify-content: left;
}

.openButton {
	border: none;
	border-radius: 5px;
	background-color: #1c87c9;
	color: white;
	padding: 14px 20px;
	cursor: pointer;
	position: fixed;
}

.selectFlightPopup {
	position: relative;
	text-align: center;
	width: 100%;
}

.formPopup {
	display: none;
	position: fixed;
	left: 45%;
	top: 5%;
	transform: translate(-50%, 5%);
	border: 3px solid #999999;
	z-index: 9;
}

.formContainer {
	max-width: 300px;
	padding: 20px;
	background-color: #fff;
}

.formContainer input[type=text], .formContainer input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 20px 0;
	border: none;
	background: #eee;
}

.formContainer input[type=text]:focus, .formContainer input[type=password]:focus
	{
	background-color: #ddd;
	outline: none;
}

.formContainer .btn {
	padding: 12px 20px;
	border: none;
	background-color: #8ebf42;
	color: #fff;
	cursor: pointer;
	width: 100%;
	margin-bottom: 15px;
	opacity: 0.8;
}

.formContainer .cancel {
	background-color: #cc0000;
}

.formContainer .btn:hover, .openButton:hover {
	opacity: 1;
}

.row {
	display: flex;
	justify-content: space-around;
}

.column {
	flex: 40%;
	padding: 5px;
}

.minusbutton {
	border-radius: 50%;
	border: none;
	font-weight: bold;
	font-size: 20px;
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
<SCRIPT language="javascript">
	function addRow(tableid) {

		var table = document.getElementById(tableid);

		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);

		var cell1 = row.insertCell(0);
		var element1 = document.createElement("input");
		element1.type = "checkbox";
		element1.name = "chkbox[]";
		cell1.appendChild(element1);

		var cell2 = row.insertCell(1);
		var element2 = document.createElement("input");
		element2.type = "text";
		element2.name = "txtbox[]";
		element2.style.width = "86%";
		cell2.appendChild(element2);
		// cell2.innerHTML = rowCount + 1;

		var cell3 = row.insertCell(2);
		var element3 = document.createElement("input");
		element3.type = "text";
		element3.name = "txtbox[]";
		element3.style.width = "93%";
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
</SCRIPT>
</Head>

<Body>
	<div class="center">
		 <form:form action="/booking" method="get"
		modelAttribute="bookingWrapper" class="inner">

			<label for="awbn">AWB Number:</label>
			<form:input type="text" id="awbn" name="awbn" maxlength="11" size="11"
			path="basicBookingDetails.awbNumber" />
			 <label for="ubr">UBR
				Number:</label>
				<form:input type="text" id="ubrn" name="ubrn" path="basicBookingDetails.ubrNumber" />
				 <input
				type="submit" class="btn btn-primary" value="New/List">

		</form:form> 


		<form:form action="/booking" modelAttribute="bookingWrapper" method="POST"  class="inner">

			<p class="left">
				<strong>SHIPMENT DETAILS</strong>
			</p>



			<div style="width: 30%; Text-align: left; float: left;">
				<label for="origin">Origin:</label> 
			<form:select path="basicBookingDetails.origin" name="origin" id="origin">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
			<form:option value="LAX">CVG</form:option>
		</form:select>
			</div>

			<div style="width: 30%; Text-align: left; float: left;">
				<label for="destination">Destination:</label>   <form:select
			name="destination" id="destination" path="basicBookingDetails.destination">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>'
			<form:option value="LAX">DFW</form:option>
		</form:select> 
			</div>

			<div style="width: 40%; Text-align: left; float: left;">
				<label for="ShipingDate">Shiping Date:</label>  <form:input type="text"
			id="shippingDate" name="shippingDate" path="basicBookingDetails.shippingDate"/>
			</div>


			<br> <br>

			<div style="width: 30%; Text-align: left; float: left;">
				<label for="Agentcode">Agent Code:</label>  <form:select name="agentCode" id="agentCode" path="basicBookingDetails.agentCode">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">AGTDFW</form:option>
		</form:select> 
			</div>

			<div style="width: 30%; Text-align: left; float: left;">
				<label for="agentName">Agent Name:</label>	<form:input type="text"
			id="agentName" name="agentName" path="basicBookingDetails.agentName"/>
			</div>

			<div style="width: 40%; Text-align: left; float: left;">
				<label for="SCC">SCC:</label> <form:select name="scc" id="scc" path="basicBookingDetails.scc">
			<form:option value="AOG">AOG</form:option>
			<form:option value="AVI">AVI</form:option>
			<form:option value="CC1">CC1</form:option>
			<form:option value="CHI">CHI</form:option>
			<form:option value="CON">CON</form:option>
			<form:option value="EXT">EXT</form:option>
			<form:option value="GEN">GEN</form:option>
			<form:option value="HUM">HUM</form:option>
			<form:option value="ICE">ICE</form:option>
			<form:option value="MED">MED</form:option>
			<form:option value="PER">PER</form:option>
			<form:option value="PIL">PIL</form:option>
			<form:option value="AOG">AOG</form:option>
			<form:option value="RMD">RMD</form:option>
			<form:option value="DGR">DGR</form:option>
			<form:option value="VAL">VAL</form:option>
			<form:option value="SEA">SEA</form:option>
		</form:select>
			</div>

			<br> <br>

			<div style="width: 30%; Text-align: left; float: left;">
				<label for="customerCode">Customer Code:</label> 	<form:select name="customerCode" id="customerCode" path="basicBookingDetails.customerCode">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
		</form:select>
			</div>


			<div style="width: 30%; Text-align: left; float: left;">
				<label for="customerName">Customer Name:</label>   <form:input type="text"
			id="customerName" name="customerName" path="basicBookingDetails.customerName"/>
			</div>

			<div style="width: 40%; Text-align: left; float: left;">
				<label for="ServiceClass">Service Class:</label> 	<form:select name="sclass"
			id="sclass" path="basicBookingDetails.serviceClass">
			<form:option value="FOC">Free of Charge</form:option>
			<form:option value="COMAT">COMAT</form:option>
		</form:select>
			</div>
			</br>

	


		<div class="inner">
			<p class="left">
				<strong>SHIPMENT/ULD</strong>
			</p>

			<div class="row">

				<div class="round">
					<P>
						<strong>BULK BOOKING</strong>
					</P>
					<!-- <input type="button" value="+" class="plusbutton btn btn-primary"
						onclick="addRow('dataTable')" style="margin: 1%" /> <input
						type="button" value=" - " class="minusbutton btn btn-danger"
						onclick="deleteRow('dataTable')" style="margin: 1%" /> <br> -->

					<table id="dataTable" border="1">
						<tr>
							
							<td>CommCode</td>
							<td>Pieces</td>
							<td>Weight</td>
							<td>Volume</td>
						</tr>
						<tr>
							<td><form:input type="text" id="commodityCode" name="commodityCode"   path="bulkBooking.commodityCode"/>
                    </td> 
                     <td><form:input type="text" id="pieceNumber" name="pieceNumber" path="bulkBooking.pieceNumber"/>
                   
                    </td>
                    <td><form:input type="text" id="weight" name="weight"  path="bulkBooking.weight"/>
                 
                    </td>
                    <td><form:input type="text" id="volume" name="volume" path="bulkBooking.volume"/>
                 
                    </td>
						</tr>
					</table>
					<br>

				</div>



				<div class="round">

					<P>
						<strong>ULD BOOKING</strong>
					</P>
				<!-- 	<INPUT type="button" value="+" class="plusbutton btn btn-primary"
						onclick="addRow('dataTable2')" style="margin: 1%" /> <INPUT
						type="button" value=" - " class="minusbutton btn btn-danger"
						onclick="deleteRow('dataTable2')" style="margin: 1%" /> -->

					<table id="dataTable2" border="1">
						<tr>
							
							<td>Type/Group</td>
							<td>No.of ULDs</td>
							<td>ULD Weight</td>
							<td>CommCode</td>
						</tr>
						<tr>
							  <td><form:input type="text" id="uldtype" name="uldtype" path="ulDdetails.uldType"/> </td>
                    <td><form:input type="text" id="noofulds" name="noofulds" path="ulDdetails.noOfUlds"/>
                     </td>
                    <td><form:input type="text" id="uldweight" name="uldweight" path="ulDdetails.uldWeight"/>
                     </td>
                    <td><form:input type="text" id="commcode" name="commcode" path="ulDdetails.commodityCode"/> 
                      </td>
						</tr>
					</table>
					<br>
				</div>
			</div>

		</div>
		<br>
		<div class="inner">
			<p class="left">
				<strong>FLIGHT DETAILS</strong>
			</p>
			<table>
				<tr>
					<td>

						<button onclick="openForm()" class="btn btn-info">Select
							Flight</button>

					</td>

				</tr>
				<tr>
					<td>
						<table>
							<tr>
								<td>Origin</td>
								<td>Destination</td>
								<td>Flight Date</td>
								<td>Flight Number</td>
							</tr>
							<tr>
								 <td><input type="text" id="Origin" name="origin" path="basicBookingDetails.origin"/>
						</td>
						<td><input type="text" id="destination" name="destination" path="basicBookingDetails.destination"/></td>
						<td> <input type="text" id="shippingDate" name="shippingDate" path="basicBookingDetails.shippingDate"/>
						</td>
						<td><input type="text" id="flightNumber" name="flightNumber" path="basicBookingDetails.flightNumber"/></td> 
					</tr>
						</table>
					</td>
				</tr>
			</table>

		</div>
			 <input type="submit" class="btn btn-success"
			value="Submit">
</form:form>

		<!-- <div class="openBtn">
        <button class="openButton" onclick="openForm()">
          <strong>Open Form</strong>
        </button>
      </div> -->

	</div>
		<div class="selectFlightPopup">
			<div class="formPopup" id="popupForm">
				<form action="/action_page.php" class="formContainer">
					<h2>Select Flight</h2>
					<label for="origin"> <strong>Origin</strong>
					</label> <input type="text" id="origin" name="origin" required> <label
						for="destination"> <strong>Destination</strong>
					</label> <input type="text" id="destination" name="destination" required>
					<label for="flightDate"> <strong>Flight Date</strong>
					</label> <input type="date" id="flightDate" name="flightDate" required>
					<br>
					<br>
					<button type="submit" class="btn">Select Flights</button>
					<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
				</form>
			</div>
		</div>
		<script>
			function openForm() {
				document.getElementById("popupForm").style.display = "block";
			}
			function closeForm() {
				document.getElementById("popupForm").style.display = "none";
			}
		</script>
		<br> <br>
</Body>

</Html>