function loadStaff(buildingId) {
  $.ajax({
    type: "GET",
    url: "api/building/" + buildingId + "/staffs",
    contentType: "application/json",
    dataType: "JSON",
    success: function (response) {
      var row = "";
      console.log(response);
    }
  });
}

loadStaff();