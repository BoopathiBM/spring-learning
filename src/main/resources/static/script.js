document.addEventListener("DOMContentLoaded", function () {
    const links = document.querySelectorAll("nav ul li a");

    links.forEach(link => {
        link.addEventListener("click", function (event) {
            const targetId = this.getAttribute("href");

            // Allow external pages to navigate normally
            if (!targetId.startsWith("#")) {
                return; // Don't prevent default for external links
            }

            event.preventDefault();
            const targetElement = document.getElementById(targetId.substring(1));

            if (targetElement) {
                window.scrollTo({
                    top: targetElement.offsetTop - 50, // Adjust for header height
                    behavior: "smooth"
                });
            }
        });
    });
});
