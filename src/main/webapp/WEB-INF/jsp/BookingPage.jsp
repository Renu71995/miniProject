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


<script>
	$(function() {
		$("#flightDate").datepicker();
	});
</script>
<script>
	$(function() {
		$("#Availableflightdate").datepicker();
	});
</script>

<script>
$(document).ready(function() {

        $("#dataTable2").find("*").attr("disabled", "disabled");
        if ($("#awbn").val() == 0)
        $("#awbn").attr("value","");

	function chooseBulk(){
		var isChecked = $("#r1").prop('checked');
                if (isChecked == true){
                                   
                  $("#dataTable").find("*").removeAttr('disabled');
        //          $("#dataTable2").find("*").attr("innerHTML","");

                    $("#uldtype").val('');
                    $("#noofulds").val('');
                   $("#uldweight").val('');
                   $("#commcode").val('');
                  $("#dataTable2").find("*").attr("disabled", "disabled");
                  
             //     $('#dataTable2 tr').each(function(i) {
               //       if (i === 0) return; // skip header row
              //       $(this).children().eq(0).value = "";
             //        $(this).children().eq(1).value = "";
              //       $(this).children().eq(2).value = "";
              //       $(this).children().eq(3).value = "";
             //     });
                  
                }
	}

	function chooseULD(){
		var isChecked = $("#r2").prop('checked');
                if (isChecked == true){
                 
                  $("#dataTable2").find("*").removeAttr('disabled');
                  $("#commodityCode").val('');
                  $("#pieceNumber").val('');
                  $("#weight").val('');
                  $("#volume").val('');
                  $("#dataTable").find("*").attr("disabled", "disabled");
                  
                }
	}

	$("#r1").click(function(){
		chooseBulk();
	});

       $("#r2").click(function(){
		chooseULD();
	});

});
</script>

<style>
.center {
	padding: 100px 30px 30px 30px;
	border: 2px solid black;
	text-align: center;
}

.left {
	padding: 15px 0;
	text-align: left;
}

.inner {
	border: 1px solid black;
	padding: 30px 0px 40px 30px;
	float: center;
	border-radius: 2px;
}

.round {
	border: 1px solid black;
	border-radius: 12px;
	width: 48%;
	Text-align: left;
	float: left;
	padding: 10px;
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
	padding-right: 20px;
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

function validateSearch() {
	  
	  var x = document.forms["searchform"]["awbn"].value;
	  var y = document.forms["searchform"]["ubrn"].value;
	  if ((x == "") && (y == "")) {
	    alert('Please enter AWB number ! ');
	    return false;
	  }
	}
function validateFields()
{
	var cansubmit = true;
	
	var ele = document.getElementById('r1');
	document.getElementById('awbn').value = "";
	document.getElementById('ubrn')value = "";
    

	if (ele.checked == true){
		var table = document.getElementById('dataTable');
		var row = table.rows;
		
		var c = 0;
		 while(cell=row[1].cells[c++])
		  {
			 var val = cell.childNodes[0].value;
			 if (val  == "")
		    cansubmit = false;
		  }
	}
	else{
		var table = document.getElementById('dataTable2');
		var row = table.rows;
		
		var c = 0;
		 while(cell=row[1].cells[c++])
		  {
			 var val = cell.childNodes[0].value;
			 if (val  == "")
		    cansubmit = false;
		  }
	}
	
    
/*
    for (var i = 0; i < f.length; i++) {
    	
        if (f[i].value.length == 0) cansubmit = false;
    }
*/
    if (cansubmit == false) {
        alert('Please complete the Bulk / ULD details');
        return false;
    }
    else return true;
}

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

<!-- Header -->

<header>
<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
<a class="navbar-brand" href="#">iCargo Demo</a>
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarNav">
<ul class="navbar-nav">
<li class="nav-item">
<a class="nav-link" href="#">Maintain Booking</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">AWB Execution</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">AWB Acceptance</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">Export Manifest</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">Flight Arrival</a>
</li>
 
</ul>
</div>
</nav>
</header>

<!-- End of Header -->

<Body>

	<div class="center">
	<font color="red">${errorMessage1}</font>
		 <form:form action="/booking" method="get" name = "searchform" id = "searchform" class = "inner"
		modelAttribute="bookingWrapper" onsubmit = "return validateSearch()">

			<label for="awbn">AWB Number:</label>
			<form:input type="number" id="awbn" name="awbn" maxlength="11" size="11"
			path="basicBookingDetails.awbNumber" />
			 <label for="ubr">UBR
				Number:</label>
				<form:input type="text" id="ubrn" name="ubrn" pattern="([A-Z]{6}-[0-9]+)" maxlength="20" size="20" path="basicBookingDetails.ubrNumber" />
				 <input
				type="submit" class="btn btn-primary" value="New/List">

		</form:form> 

		<font color="red">${errorMessage}</font>
		<font color="red">${errorMessage3}</font>
		<form:form action="/booking" modelAttribute="bookingWrapper" method="POST"  name="form1" id = "form1" onsubmit = "return validateFields()">
		
		<div class = "inner">


			<p class="left">
				<strong>SHIPMENT DETAILS</strong>
			</p>



			<div style="width: 30%; Text-align: left; float: left;">
				<label for="origin">Origin:</label> 
			<form:select path="basicBookingDetails.origin" name="origin" id="origin">
			<form:option value="MEX">MEX</form:option>
			<form:option value="JFK">JFK</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>
			<form:option value="CVG">CVG</form:option>
		</form:select>
			</div>

			<div style="width: 30%; Text-align: left; float: left;">
				<label for="destination">Destination:</label>   <form:select
			name="destination" id="destination" path="basicBookingDetails.destination">
			<form:option value="MEX">MEX</form:option>
			<form:option value="JFK">JFK</form:option>
			<form:option value="MIA">MIA</form:option>
			<form:option value="LAX">LAX</form:option>'
			<form:option value="DFW">DFW</form:option>
		</form:select> 
			</div>

			<div style="width: 40%; Text-align: left; float: left;">
				<label for="ShipingDate">Shiping Date:</label>  <form:input type="text"
			id="shippingDate" name="shippingDate" required = "required" path="basicBookingDetails.shippingDate"/>
			</div>


			<br> <br>

			<div style="width: 30%; Text-align: left; float: left;">
				<label for="Agentcode">Agent Code:</label>  <form:select name="agentCode" id="agentCode" path="basicBookingDetails.agentCode">
			<form:option value="AGTCVG">AGTCVG</form:option>
			<form:option value="AGTLAX">AGTLAX</form:option>
			<form:option value="AGTMIA">AGTMIA</form:option>
			<form:option value="AGTDFW">AGTDFW</form:option>
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
			<form:option value="MEX">CUSTMEX</form:option>
			<form:option value="JFK">CUSTJFK</form:option>
			<form:option value="MIA">CUSTMIA</form:option>
			<form:option value="LAX">CUSTLAX</form:option>
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
		<div><br></br></div>
			</div>
			
      
	</div>
	<br></br>


		<div class="inner">
			<p class="left">
				<strong>SHIPMENT/ULD</strong>
			</p>

			<div class="row">

				<div class="round">

                      <input type="radio" id="r1" name="myOptions" value="BULK" checked />
                       <label for="r1"><strong>BULK BOOKING</strong></label>
					<!-- <input type="button" value="+" class="plusbutton btn btn-primary"
						onclick="addRow('dataTable')" style="margin: 1%" /> <input
						type="button" value=" - " class="minusbutton btn btn-danger"
						onclick="deleteRow('dataTable')" style="margin: 1%" /> <br> -->

					<table id="dataTable" name = "dataTable" border="1">
						<tr>
							
							<td>CommCode</td>
							<td>Pieces</td>
							<td>Weight</td>
							<td>Volume</td>
						</tr>
						<tr>
							<td><form:input type="text" style="width:100%" id="commodityCode" name="commodityCode"   path="bulkBooking.commodityCode"/>
                    </td> 

                     <td><form:input type="number" id="pieceNumber" min = "0" style="width:100%" name="pieceNumber" path="bulkBooking.pieceNumber"/>
                   
                    </td>
                    <td><form:input type="number" min = "0" step = "any" id="weight" style="width:100%" name="weight"  path="bulkBooking.weight"/>
                 
                    </td>
                    <td><form:input type="number" min = "0" step = "any" id="volume" style="width:100%" name="volume" path="bulkBooking.volume"/>

                 
                    </td>
						</tr>
					</table>
					<br>

				</div>



				<div class="round">


                       <input type="radio" id="r2" name="myOptions" value="ULD" />  
                       <label for="r1"><strong>ULD BOOKING</strong></label>
				<!-- 	<INPUT type="button" value="+" class="plusbutton btn btn-primary"
						onclick="addRow('dataTable2')" style="margin: 1%" /> <INPUT
						type="button" value=" - " class="minusbutton btn btn-danger"
						onclick="deleteRow('dataTable2')" style="margin: 1%" /> -->

					<table id="dataTable2" name = "dataTable2" border="1">
						<tr>
							
							<td>Type/Group</td>
							<td>No.of ULDs</td>
							<td>ULD Weight</td>
							<td>CommCode</td>
						</tr>
						<tr>
							  <td><form:input type="text" id="uldtype" style="width:100%" name="uldtype" path="ulDdetails.uldType"/> </td>

                    <td><form:input type="number" min = "0" id="noofulds" style="width:100%" name="noofulds" path="ulDdetails.noOfUlds"/>
                     </td>
                    <td><form:input type="number" id="uldweight" min = "0" step = "any" style="width:100%" name="uldweight" path="ulDdetails.uldWeight"/>

                     </td>
                    <td><form:input type="text" id="commcode" style="width:100%" name="commcode" path="ulDdetails.commodityCode"/> 
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

					<!-- 	<button onclick="openForm()" class="btn btn-info">Select
							Flight</button> -->
							
							<input type="button"  id="SearchFlightsButton" class="btn btn-warning"	
				value="SearchFlights">

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
						 <td><form:input type="text" id="Origin" name="origin" maxlength="3" size="3" pattern="[A-Z]{3}" required = "required" path="basicBookingDetails.flightDetailsOrigin"/>
						</td>
						<td><form:input type="text" id="destination" name="destination" maxlength="3" size="3" pattern="[A-Z]{3}" required = "required" path="basicBookingDetails.flightDetailsDestination"/></td>
						<td><form:input type="text" id="flightDate" name="flightDate" required = "required" path="basicBookingDetails.flightDate"/>
						</td>
						<td><form:input type="text" id="flightNumber" name="flightNumber" required = "required" maxlength="7" pattern="([A-Z0-9]{2} [0-9]{4})" path="basicBookingDetails.flightNumber"/></td> 
					</tr>
				</table>
					</td>
				</tr>
			</table>

		</div>
            <br> </br>
			 <input type="submit" id="mainSubmitButton" class="btn btn-success" 

			value="Submit">
</form:form>

		<!-- <div class="openBtn">
        <button class="openButton" onclick="openForm()">
          <strong>Open Form</strong>
        </button>
      </div> -->

	</div>
	
	<script>	
var form = document.getElementById('form2');	
document.getElementById('SearchFlightsButton').onclick = function() {	
		
	document.getElementById("popupForm").style.display = "block";	
    	
}	

</script>
	
		<div class="selectFlightPopup">
			<div class="formPopup" id="popupForm">
			
<form:form action="/booking/getFlights" modelAttribute="bookingWrapper" method="GET" class="formContainer">
				
					<h2>Select Flight</h2>
					 <label for="origin"> <strong>Origin</strong></label> 
					<form:input type="text" id="flightorigin" name="flightorigin" path="flightDetails.origin"/>
					 <label for="destination"> <strong>Destination</strong></label>
					<form:input type="text" id="flightdestination" name="flightdestination" path="flightDetails.destination"/>
					<label for="flightDate"> <strong>Flight Date</strong>
					</label> <form:input type="text" id="Availableflightdate" name="flightdate" path="flightDetails.shipmentDate"/>
					<br>
					<br>
					<button type="submit" class="btn">Select Flights</button>
					<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
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
		<br> <br>
</Body>

<!-- Footer -->
<footer>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<a class="navbar-brand mx-auto" href="#">iCargo Demo</a>
</nav>
</footer>
</Html>





