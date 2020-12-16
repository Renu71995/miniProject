<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Paragraph tag</title>
<style>
.center {
	padding: 70px 0;
	border: 3px solid green;
	text-align: center;
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
}

.column {
	flex: 50%;
	padding: 5px;
}
</style>
<SCRIPT language="javascript">
	function addRow(tableID) {

		var table = document.getElementById(tableID);

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
	}

	function deleteRow(tableID) {
		try {
			var table = document.getElementById(tableID);
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

</head>
<body>
	 <form:form action="/booking" method="get"
		modelAttribute="bookingWrapper" class="center">
		<label for="awbn">AWB Number:</label>
		<form:input type="text" id="awbn" name="awbn" maxlength="11" size="11"
			path="basicBookingDetails.awbNumber" />
		<label for="ubr">UBR Number:</label>
		<form:input type="text" id="ubrn" name="ubrn" path="basicBookingDetails.ubrNumber" />
		<input type="submit" value="NewList">
	</form:form> 

	  <p>SHIPMENT DETAILS</p>
	<form:form action="/booking" modelAttribute="bookingWrapper" method="POST" class="center">
		<label for="origin">origin:</label> 
		<form:select path="basicBookingDetails.origin" name="origin" id="origin">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
		</form:select>
		 <label for="destination">destination:</label>
		  <form:select
			name="destination" id="destination" path="basicBookingDetails.destination">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
		</form:select> 
		<label for="ShipingDate">Shiping Date:</label>
		 <form:input type="date"
			id="shippingDate" name="shippingDate" path="basicBookingDetails.shippingDate"/> <br> <br> 
			<label for="Agentcode">Agent Code:</label>
			 <form:select name="origin" id="origin" path="basicBookingDetails.agentCode">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
		</form:select> 
		<label for="agentName">Agent Name:</label>
		<form:input type="text"
			id="agentName" name="agentName" path="basicBookingDetails.agentName"/>
		 <label for="SCC">SCC:</label>
		<form:select name="scc" id="scc" path="basicBookingDetails.scc">
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
		</form:select> <br> <br> <label for="customerCode">Customer Code:</label>
		<form:select name="customerCode" id="customerCode" path="basicBookingDetails.customerCode">
			<form:option value="MAX">MAX</form:option>
			<form:option value="USA">USA</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
		</form:select>
		 <label for="customerName">Customer Name:</label>
		  <form:input type="text"
			id="customerName" name="customerName" path="basicBookingDetails.customerName"/> <label
			for="ServiceClass">Service Class:</label> 
			<form:select name="sclass"
			id="sclass" path="basicBookingDetails.serviceClass">
			<form:option value="FOC">Free of Charge</form:option>
			<form:option value="COMAT">COMAT</form:option>
		</form:select>
 
	
	<p>SHIPMENT/ULD</p>

<div class="row">
        <div class="column">
            <P>Bulk Booking</P>
            <input type="button" value="Add Row" onclick="addRow('dataTable')"
                style="margin: 1%" /> <input type="button" value="Delete Row"
                onclick="deleteRow('dataTable')" style="margin: 1%" /> <br>

 

            <table id="dataTable" width="350px" border="1">
                <tr>
                    <td></td>
                    <td>CommCode</td>
                    <td>pcs</td>
                    <td>Weight</td>
                    <td>Volume</td>
                </tr>
                <tr>
                    <TD><input type="checkbox" name="chk" /></TD>
                    <td><form:input type="text" id="commodityCode" name="commodityCode" path="bulkBooking.commodityCode"/>
                    </td> 
                    <td><form:input type="text" id="pieceNumber" name="pieceNumber" path="bulkBooking.pieceNumber"/></td>
                    <td><form:input type="text" id="weight" name="weight" path="bulkBooking.weight"/></td>
                    <td><form:input type="text" id="volume" name="volume" path="bulkBooking.volume"/></td>
                </tr>
            </table>

 

        </div>



		<div class="column">

            <P>ULD Booking</P>
            <input type="button" value="Add Row" onclick="addRow('dataTable2')"
                style="margin: 1%" /> <input type="button" value="Delete Row"
                onclick="deleteRow('dataTable2')" style="margin: 1%" />
            <table id="dataTable2" width="350px" border="1">
                <tr>
                    <td></td>
                    <td>ULD Type/Group</td>
                    <td>No.of ULDs</td>
                    <td>ULD Weight</td>
                    <td>CommCode</td>
                </tr>
                <tr>
                    <TD><input type="checkbox" name="chk" /></TD>
                    <td><form:input type="text" id="uldtype" name="uldtype" path="ulDdetails.UldType"/></td>
                    <td><form:input type="text" id="noofulds" name="noofulds" path="ulDdetails.NoOfUlds"/>
                    </td>
                    <td><form:input type="text" id="uldweight" name="uldweight" path="ulDdetails.UldWeight"/>
                    </td>
                    <td><form:input type="text" id="commcode" name="commcode" path="ulDdetails.CommodityCode"/> 
                    </td>
                </tr>
            </table>
        </div>
    </div>


	<p>FLIGHT DETAILS</p>
	<table class="center">
		<tr>
			<td>

				<button onclick="openForm()">Select Flight</button>

			</td>

		</tr>
		<tr>
			<td>
				<table>
					<tr>
						<td>Origin</td>
						<td>Destination</td>
						<td>Flight Date</td>
						<td>Flight NO</td>
					</tr>
					<tr>
						 <td><form:input type="text" id="commcode" name="commcode" path="commcode"/>
						</td>
						<td><form:input type="text" id="pcs" name="pcs" path="pcs"/></td>
						<td><form:input type="date" id="shipingdate" name="shipingdate" path="shipingdate"/>
						</td>
						<td><form:input type="text" id="volume" name="volume" path="volume"/></td> 
					</tr>
				</table>
			</td>
		</tr>
	</table>


</form:form>

	<div class="openBtn">
		<button class="openButton" onclick="openForm()">
			<strong>Open Form</strong>
		</button>
	</div>
	<div class="selectFlightPopup">
		<div class="formPopup" id="popupForm">
			<form:form action="/booking/getFlights" class="formContainer" modelAttribute="flightDetails">
				<h2>Select Flight Popup</h2>
				<label for="origin"> <strong>Origin</strong></label>
				 <form:input type="text" id="origin" placeholder="Origin" name="origin" path="origin" required="required"/>
				<label for="destination"> <strong>Destination</strong></label> 
				<form:input type="text" id="destination" placeholder="Destination"
					name="destination" path="destination" required="required"/>
					 <label for="flightDate">
					<strong>Flight Date</strong>
				</label>
				 <form:input type="date" id="shipmentDate" placeholder="Flight Date"
					name="shipmentDate" path="shipmentDate" required="required"/>
				<form:button type="submit" class="btn">Select Flights</form:button>
				<form:button type="button" class="btn cancel" onclick="closeForm()">Close</form:button>
			</form:form>
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
	<br>
	<br>

	<input type="submit" value="Submit"/>

</body>
</html>