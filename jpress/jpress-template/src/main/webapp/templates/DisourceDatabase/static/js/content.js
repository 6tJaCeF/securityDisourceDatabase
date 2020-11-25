$(document).ready(function () {
    $(".nav li").click(function(){
        $(".nav li").removeClass("active");
        $(this).addClass("active");
        if($(this).find("a").html()=="分类"){
            $(".info-inner").eq(0).css("display","");
            $(".info-inner").eq(1).css("display","none");
        }else if ($(this).find("a").html()=="来源"){
            $(".info-inner").eq(0).css("display","none");
            $(".info-inner").eq(1).css("display","");
        }
    });
});