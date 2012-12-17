function customRange(input) {
    var min = new Date(2000, 1, 1);
    var dateMax, dateMin;

    if (input.id === "fromDate") {
        if ($("#toDate").datepicker("getDate") != null) {
            dateMax = $("#toDate").datepicker("getDate");
        }
        else {
            dateMax = new Date(); //Set this to your absolute maximum date
        }
        dateMin = min;
    }
    else if (input.id === "toDate") {
        dateMax = new Date; //Set this to your absolute maximum date
        if ($("#fromDate").datepicker("getDate") != null) {
            dateMin = $("#fromDate").datepicker("getDate");
        } else {
            dateMin = min;
        }
        dateMax = new Date();
    }
    return {
        minDate: dateMin,
        maxDate: dateMax
    };
}

function isDate(txtDate) {
    var currVal = txtDate;
    if(currVal == '') {
        return false;
    }

    var rxDatePattern = /^(\d{1,2})(\/|-)(\d{1,2})(\/|-)(\d{4})$/;
    var dtArray = currVal.match(rxDatePattern); // is format OK?

    if (dtArray == null)
        return false;

    dtMonth = dtArray[1];
    dtDay= dtArray[3];
    dtYear = dtArray[5];

    if (dtMonth < 1 || dtMonth > 12)
        return false;
    else if (dtDay < 1 || dtDay> 31)
        return false;
    else if ((dtMonth==4 || dtMonth==6 || dtMonth==9 || dtMonth==11) && dtDay ==31)
        return false;
    else if (dtMonth == 2)
    {
        var isleap = (dtYear % 4 == 0 && (dtYear % 100 != 0 || dtYear % 400 == 0));
        if (dtDay> 29 || (dtDay ==29 && !isleap))
            return false;
    }
    return true;
}