/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validation() {
    var bn = document.forms["ajouterbus"]["nom_bus"].value;
    var dc = document.forms["ajouterbus"]["ville_depart"].value;
    var ac = document.forms["ajouterbus"]["ville_arrivee"].value;
    var dt = document.forms["ajouterbus"]["heure_depart"].value;
    var tt = document.forms["ajouterbus"]["duree_voyage"].value;
    var c = document.forms["ajouterbus"]["prix_voyage"].value;
    var s = document.forms["ajouterbus"]["sieges"].value;
    var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

    if (bn == "" || dc == "" || ac == "" || dt == "" || tt == "" || c == ""
            || s == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    } else if (!dt.match(time) || !tt.match(time)) {
        alert("Le temps doit être au format HH:MM!");
        document.forms["ajouterbus"]["heure_depart"].style.borderColor = "red";
        return false;
    }
}

function validation1() {
    var bon = document.forms["ajoutercompagnie"]["nom_compagnie"].value;
    var e = document.forms["ajoutercompagnie"]["email"].value;
    var ad = document.forms["ajoutercompagnie"]["adresse"].value;
    var ct = document.forms["ajoutercompagnie"]["ville"].value;
    var pn = document.forms["ajoutercompagnie"]["telephone"].value;
    var pw = document.forms["ajoutercompagnie"]["mdp"].value;
    var npw = document.forms["ajoutercompagnie"]["newmdp"].value;
    var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

    if (bon == "" || e == "" || ad == "" || ct == "" || pn == "" || pw == ""
            || npw == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation2() {
    var un = document.forms["loginform"]["email"].value;
    var pwd = document.forms["loginform"]["mdp"].value;

    if (un == "" || pwd == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation3() {
    var nos = document.forms["reserverticket"]["sieges"].value;
    var e = document.forms["reserverticket"]["email"].value;
    var bid = document.forms["reserverticket"]["id_bus"].value;
    var dd = document.forms["reserverticket"]["date_depart"].value;

    var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

    if (nos == "" || e == "" || bid == "" || dd == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation4() {
    var un = document.forms["logincompagnie"]["email"].value;
    var pwd = document.forms["logincompagnie"]["mdp"].value;

    if (un == "" || pwd == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation5() {
    var op = document.forms["changermdp"]["ancienmdp"].value;
    var np = document.forms["changermdp"]["nouveaumdp"].value;
    var cp = document.forms["changermdp"]["confirmermdp"].value;

    if (op == "" || np == "" || cp == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation6() {
    var pn = document.forms["supprcompagnie"]["telephone"].value;
    var pwd = document.forms["supprcompagnie"]["mdp"].value;

    if (pn == "" || pwd == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation7() {
    var pn = document.forms["suppruser"]["telephone"].value;
    var pwd = document.forms["suppruser"]["mdp"].value;

    if (pn == "" || pwd == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation8() {
    var bn = document.forms["modifierbus"]["nom_bus"].value;
    var bt = document.forms["modifierbus"]["type_bus"].value;
    var dc = document.forms["modifierbus"]["ville_depart"].value;
    var ac = document.forms["modifierbus"]["ville_arrivee"].value;
    var dt = document.forms["modifierbus"]["heure_depart"].value;
    var tt = document.forms["modifierbus"]["duree_voyage"].value;
    var od = document.forms["modifierbus"]["jours_voyage"].value;
    var c = document.forms["modifierbus"]["prix_voyage"].value;
    var nos = document.forms["modifierbus"]["sieges"].value;
    var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

    if (bn == "" || bt == "" || bt1 == "" || dc == "" || ac == "" || dt == ""
            || tt == "" || od == "" || c == "" || nos == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    } else if (!dt.match(time) || !tt.match(time)) {
        alert("Le temps doit être au format HH:MM!");
        document.forms["modifierbus"]["heure_depart"].style.borderColor = "red";
        return false;
    }
}

function validation9() {
    var fn = document.forms["modifierprofil"]["nom"].value;
    var ln = document.forms["modifierprofil"]["prenom"].value;
    var add = document.forms["modifierprofil"]["adresse"].value;
    var c = document.forms["modifierprofil"]["ville"].value;
    var e = document.forms["modifierprofil"]["email"].value;
    var pn = document.forms["modifierprofil"]["telephone"].value;

    if (fn == "" || ln == "" || add == "" || c == "" || e == "" || pn == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation10() {
    var un = document.forms["oubliemdp"]["email"].value;
    var sq = document.forms["oubliemdp"]["secQstn"].value;
    var sa = document.forms["oubliemdp"]["secAns"].value;

    if (un == "" || sq == "" || sa == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation11() {
    var b = document.forms["form"]["reservation"].value;

    if (b == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation12() {
    var f = document.forms["rechercherbus"]["depart"].value;
    var t = document.forms["rechercherbus"]["arrivee"].value;
    var d = document.forms["rechercherbus"]["date_depart"].value;

    if (f == "" || t == "" || d == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation13() {
    var e = document.forms["loginuser"]["email"].value;
    var p = document.forms["loginuser"]["mdp"].value;

    if (e == "" || p == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation14() {
    var u = document.forms["login"]["email"].value;
    var p = document.forms["login"]["mdp"].value;

    if (u == "" || p == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }
}

function validation15() {
    var u = document.forms["ajouteruser"]["email"].value;
    var p = document.forms["ajouteruser"]["mdp"].value;
    var cp = document.forms["ajouteruser"]["confirmermdp"].value;
    var fn = document.forms["ajouteruser"]["nom"].value;
    var ln = document.forms["ajouteruser"]["prenom"].value;
    var c = document.forms["ajouteruser"]["ville"].value;
    var add = document.forms["ajouteruser"]["adresse"].value;
    var pn = document.forms["ajouteruser"]["telephone"].value;

    if (u == "" || p == "" || cp == "" || fn == "" || ln == "" || c == ""
            || add == "" || pn == "") {
        alert('Veuillez remplir tous les champs!');

        return false;
    }

    function cancelBack() {
        if ((event.keyCode == 8 || (event.keyCode == 37 && event.altKey) || (event.keyCode == 39 && event.altKey))
                && (event.srcElement.form == null || event.srcElement.isTextEdit == false)) {
            alert("Requête invalide!");
            event.cancelBubble = true;
            event.returnValue = false;
        }
    }

    window.onload = function () {
        noBack();
    }
    window.history.forward();
    function noBack() {
        window.history.forward();
    }

}


