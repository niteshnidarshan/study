var totalRows   = 9; //To loop total rows
var selectedRow = 0; //To retain selected row id

$("#userTable").ready(function() { 
    $("#userTable").on('click', 'tr td', function()
    {
        //To get the selected row on click event
        selectedRow = $(this).parent().attr("id").charAt(1); 
        $("tr#x"+selectedRow).css("background-color", "skyblue");
        
        //To hielight only selected record 
        for(var i = 1; i<=totalRows; i++)
        {
            if(i != selectedRow)
            {
                $("tr#x"+i).removeAttr('style');    
            }

        }
    });
});
function setUp()
{ 
    if(selectedRow == 0)
    {
        alert("select a row to swap ...");
        return;
    }
    if(selectedRow <= 1)
    {
        alert("This is the first record ...");
    }
    else
    {  
        //td value collection
        var currentTdValue   = $("tr#x"+selectedRow).find("td:eq(0)").text();
        var upperTdValue     = $("tr#x"+(parseInt(selectedRow)-1)).find("td:eq(0)").text();
        
        //tr value collection
        var currentRowValue = $("tr#x"+selectedRow).html();
        var upperRowValue   = $("tr#x"+(parseInt(selectedRow)-1)).html();

        //tr swapping
        $("tr#x"+selectedRow).html(upperRowValue);
        $("tr#x"+(parseInt(selectedRow)-1)).html(currentRowValue); 

        //td swapping
        $("tr#x"+selectedRow).find("td:eq(0)").html(currentTdValue);
        $("tr#x"+(parseInt(selectedRow)-1)).find("td:eq(0)").html(upperTdValue);

        //removing selected row color
        $("tr#x"+selectedRow).removeAttr('style');
        $("tr#x"+(parseInt(selectedRow)-1)).css("background-color", "purple");

        //setting the selected row as initail, so that no swapping will be occurred if no row selected 
        selectedRow = 0;

    }
}

function setDown()
{
    if(selectedRow == 0)
    {
        alert("select a row to swap ...");
        return;
    }
    if(selectedRow >= totalRows)
    {
        alert("This is the last record ...");
    }
    else
    {
        var downRow = parseInt(selectedRow)+1; //To get integer of row id 

        //td value collection
        var currentTdValue   = $("tr#x"+selectedRow).find("td:eq(0)").text();
        var lowerTdValue     = $("tr#x"+downRow).find("td:eq(0)").text();

        //tr value collection
        var currentRowValue = $("tr#x"+selectedRow).html();
        var lowerRowValue   = $("tr#x"+downRow).html();
       
        //tr swapping
        $("tr#x"+selectedRow).html(lowerRowValue);
        $("tr#x"+downRow).html(currentRowValue);

        //td swapping
        $("tr#x"+selectedRow).find("td:eq(0)").html(currentTdValue);
        $("tr#x"+downRow).find("td:eq(0)").html(lowerTdValue);

        //removing selected row color
        $("tr#x"+selectedRow).removeAttr('style');
        $("tr#x"+downRow).css("background-color", "purple");

         //setting the selected row as initail, so that no swapping will be occurred if no row selected 
        selectedRow = 0;
    }
}