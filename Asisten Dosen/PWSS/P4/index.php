<?php
    include "array.php";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="tampil.css">
    <title>Tugas</title>
</head>
<body>
<div class="container">
    <div class="wrapper">
        <form action="send.php" method="post">
            <div class="form-group">
                <label for="Name">Your Name</label>
                <div class="form-group-item">
                    <input type="text" name="fName" class="form-control" placeholder="First Name">
                    <input type="text" name="lName" class="form-control" placeholder="Last Name">
                </div>
            </div>
            
            <!-- NIM -->
            <div class="form-group">
                <label for="SN">Student Number</label>
                <div class="form-group-item">
                <input type="text" class="form-control" name="nim" placeholder="Sudent Number / NIM">
                </div>
            </div>
            <!-- End NIM -->

            <!-- Hobbies -->
            <div class="form-group">
                <label for="hobi">Hobbies</label>
                <div class="form-group-item">
                    <?php
                        foreach($hobbies as $key => $hobby){
                            echo "<input type='checkbox' name='hobi[]' value='$hobby' class='form-check'> $hobby<br>";
                        }
                        ?>
                </div>
            </div>
            <!-- End Hobbies -->

            <!-- Date -->
            <div class="form-group">
                    <label for="Birthday">Birthday</label>
                    <div class="form-group-item">
                        <select name="day" id="day">
                            <?php
                                foreach($days as $day){
                                    echo "<option value='$day'>$day</option>";
                                }
                            ?>
                        </select>
                        <select name="month" id="month">
                            <?php
                                foreach($months as $month){
                                    echo "<option value='$month'>$month</option>";
                                }
                            ?>
                        </select>
                        <select name="year" id="year">
                            <?php
                                foreach($years as $year){
                                    echo "<option value='$year'>$year</option>";
                                }
                            ?>
                        </select>
                    </div>
            </div>
            <!-- End Date -->

            <div class="form-group">
                <div class="form-group-item">
                    <input type="submit" value="Send">
                </div>
            </div>
        </form>
    </div>
</div>

</body>
</html>