$(document).ready(function() {
  // Toggle responsive navigation
  function toggleNav() {
    var x = document.getElementById("mySidenav");
    if (x.style.right === "-250px") {
      x.style.right = "0";
    } else {
      x.style.right = "-250px";
    }
  }

  // Close the side navigation menu when clicking on a link
  $(".sidenav a").on("click", function() {
    var x = document.getElementById("mySidenav");
    x.style.right = "-250px";
  });

  // Toggle side navigation menu when clicking on the bars icon
  $(".openbtn").on("click", function() {
    toggleNav();
  });
});


function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
  }
  
  function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
  }