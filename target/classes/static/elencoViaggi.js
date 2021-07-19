
// var viaggio={
//     destinazione:"Bahamas",
//     titolo:"Vacanza da scimmie",
//     notti:"4",
// }
// var viaggio2={
//     destinazione:"Parigi",
//     titolo:"Weekend romantico",
//     notti:"3",

// }

// var viaggi= [viaggio, viaggio2];
var viaggiHTML=document.getElementById("travelsContainer");

window.addEventListener("load", carica, false);

function carica() {

    // for (var index = 0; index < viaggi.length; index++) {
    //     var element = viaggi[index];

        var travelHTML=document.createElement("div");
        travelHTML.setAttribute("class", "travel");
        travelHTML.setAttribute("th:each", "viaggio:${viaggi}");

        var textHTML=document.createElement("div");
        textHTML.setAttribute("class", "testo");

        var titleHTML=document.createElement("div");
        titleHTML.setAttribute("class", "title");

        var titleH=document.createElement("h2");

        var titleSpan=document.createElement("span");
        titleSpan.setAttribute("class", "destinazione text-muted");
        titleSpan.setAttribute("th:text", "${viaggio.destinazione}");

     //   titleSpan.innerHTML=element.destinazione + " - ";

        var tripSpan=document.createElement("span");
        tripSpan.setAttribute("class", "titoloViaggio");
        //tripSpan.innerHTML=element.titolo;

        var tripDescription=document.createElement("div");
        tripDescription.setAttribute("class", "descrizioneViaggio");
        tripDescription.innerHTML="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quidem saepe officiis ad labore, dolorem fugit dolores optio magni exercitationem odit necessitatibus quasi modi fuga reprehenderit, quod sequi? Assumenda, dolores eveniet. Lorem ipsum, dolor sit amet consectetur adipisicing elit. Impedit perspiciatis delectus cumque totam sit id quasi ut culpa voluptates. Tempora harum aut ratione dolorem pariatur! Earum ducimus perferendis aut deleniti.";

        var sideDiv=document.createElement("div");
        sideDiv.setAttribute("class", "side");
        sideDiv.innerHTML="<img src='Sardegna.jpg' alt=''>";

        var btn=document.createElement("button");
        btn.setAttribute("class", "btn-primary");
        btn.innerHTML="Prenota";
  
        sideDiv.appendChild(btn);

        titleH.appendChild(titleSpan);
        titleH.appendChild(tripSpan);

        titleHTML.appendChild(titleH);

        textHTML.appendChild(titleHTML);
        textHTML.appendChild(tripDescription);

        travelHTML.appendChild(textHTML);
        travelHTML.appendChild(sideDiv);

        viaggiHTML.appendChild(travelHTML);
        
    // }//fine for

}//fine funzione

  