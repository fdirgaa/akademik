<?php
    $fName = $_POST['fName'];
    $lName = $_POST['lName'];
    $nim = $_POST['nim'];
    $day = $_POST['day'];
    $month = $_POST['month'];
    $year = $_POST['year'];
    $hobi = [];
    if(isset($_POST['hobi'])){
        $hobi = $_POST['hobi'];
    }
    $status ="";
    if(count($hobi)==1){
        $status = "My hobby is";
    } elseif(count($hobi)>1){
        $status = "My hobbies are";
    }else{
        $status = "I have no hobbies.";
    }

    echo "<p>Hi, My name is $fName $lName.<br>
    I was born on $month $day, $year.<br>
    My Student Number is $nim<p>";
    echo $status;
    echo "<ol>";
    foreach($hobi as $hobby){
        echo "<li>$hobby</li>";
    }
    echo "</ol>";
?>