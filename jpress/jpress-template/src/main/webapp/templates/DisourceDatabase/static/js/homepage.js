$(document).ready(function () {
    var banner = new Swiper('.banner', {
        direction: 'vertical',
        autoplay: {
            delay: 3000,
            stopOnLastSlide: false,
            disableOnInteraction: false,
        },
        loop: true
    });
    var tagsBanner = new Swiper('.tags-banner', {
        slidesPerView: 6,
        spaceBetween: 60,
        navigation: {
            nextEl: '.tags-next',
            prevEl: '.tags-prev',
        }
    });
    $(".change").change(function () {
        var value = $(this).val();
        if (value == "china") {
            window.location.href = "/cn"
        } else if (value == "russia") {
            window.location.href = "/ru"
        }
    })
});