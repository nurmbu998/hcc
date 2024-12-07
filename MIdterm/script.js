document.addEventListener('DOMContentLoaded', function() {
    const sections = document.querySelectorAll('section');
    sections.forEach((section, index) => {
        section.style.opacity = 0;
        section.style.transform = 'translateY(50px)';
        setTimeout(() => {
            section.style.transition = 'all 0.5s ease-out';
            section.style.opacity = 1;
            section.style.transform = 'translateY(0)';
        }, index * 500);
    });
});
