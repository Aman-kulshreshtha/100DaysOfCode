<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.2/css/all.css" integrity="sha384-vSIIfh2YWi9wW0r9iZe7RJPrKwp6bG+s9QZMoITbCckVJqGCCRhc+ccxNcdpHuYu" crossorigin="anonymous">



    <link rel="stylesheet" href="//cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css">



    <title>CRUD app</title>
</head>

<body>
    <!-- Button trigger modal -->



    <!-- Edit Modal -->
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="editModalLabel">Edit this Note</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <form action="index.php" method="POST">
                    <div class="modal-body">
                        <input type="hidden" name="snoEdit" id="snoEdit">
                        <div class="form-group">
                            <label for="title">Note Title</label>
                            <input type="text" class="form-control" id="titleEdit" name="title" aria-describedby="emailHelp">
                        </div>

                        <div class="form-group">
                            <label for="desc">Note Description</label>
                            <textarea class="form-control" id="descriptionEdit" name="note" rows="3"></textarea>
                        </div>
                    </div>
                    <div class="modal-footer d-block mr-auto">
                        <button type="button" class="btn btn-secondary" data-dismiss="editModal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <!-- navBar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">iNotes</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>

                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>

    <?php

    if(isset($_GET['delete'])){
       $sno = $_GET['delete'];
        $servername = "localhost:3307";
        $username = "root";
        $password = "";
        $database = "notesdb";

        $conn = mysqli_connect($servername, $username, $password, $database);

        if (!$conn) {
            echo "connection unsuccessful";
        }

        $query = 'DELETE FROM `notes` WHERE `SNo` ='.$sno.';';

        $result = mysqli_query($conn, $query);

        if ($result) {
            echo '<div class="alert alert-success alert-dismissible fade show" role="alert">
    <strong>Note Deleted
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
        } else {
            echo '<div class="alert alert-warning alert-dismissible fade show" role="alert">
    <strong>Something went wrong unable to Delete note
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
        }


    }
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        $servername = "localhost:3307";
        $username = "root";
        $password = "";
        $database = "notesdb";

        $conn = mysqli_connect($servername, $username, $password, $database);

        if (!$conn) {
            echo "connection unsuccessful";
        }
        $title = $_POST['title'];
        $note = $_POST['note'];


        if (isset($_POST['snoEdit'])) {
            $query = 'UPDATE `notes` SET `title`="' . $title . '",`description`="' . $note . '" WHERE `SNo` =' . $_POST['snoEdit'] . ' ;';

            $result = mysqli_query($conn, $query);

            if ($result) {
                echo '<div class="alert alert-success alert-dismissible fade show" role="alert">
    <strong>Note Updated
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
            } else {
                echo '<div class="alert alert-warning alert-dismissible fade show" role="alert">
    <strong>Something went wrong unable to update note
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
            }
        } else {
            $query = 'INSERT INTO `notes` ( `title`, `description`, `tstamp`) VALUES ( "' . $title . '", "' . $note . '",current_timestamp());';
            $result = mysqli_query($conn, $query);

            if ($result) {
                echo '<div class="alert alert-success alert-dismissible fade show" role="alert">
    <strong>Note Entered
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
            } else {
                echo '<div class="alert alert-warning alert-dismissible fade show" role="alert">
    <strong>Something went wrong unable to take note
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
            }
        }
    }


    ?>


    <div class="container mt-3 ">
        <h2>Add a Note</h2>
        <form action="index.php" method="post">
            <div class="mt-3">
                <label for="NoteTitle" class="form-label">Notes Title</label>
                <input type="text" class="form-control" id="noteTitle" name="title">

            </div>
            <div class="mt-3">
                <label for="Note" class="form-label">Note Description</label>
                <textarea type="text" rows="3" class="form-control" id="note" name="note"></textarea>
            </div>

            <button type="submit" class="btn btn-primary mt-3 md-5">Submit</button>
        </form>
        <div class="container-fluid mt-5">
            <table class="table mt-4" id="myTable">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Title</th>
                        <th scope="col">Description</th>
                        <th scope="col">Action</th>
                        
                    </tr>
                </thead>
                <tbody>

                    <?php



                    $servername = "localhost:3307";
                    $username = "root";
                    $password = "";
                    $database = "notesdb";

                    $conn = mysqli_connect($servername, $username, $password, $database);

                    if (!$conn) {
                        echo "connection unsuccessful";
                    }


                    $query = "SELECT * FROM `notes` ";
                    $result = mysqli_query($conn, $query);
                    $counter = 1;
                    while ($row = mysqli_fetch_assoc($result)) {

                        echo ' <tr>
                            <th scope="row">' . $counter . ' </th>
                            <td>' . $row["title"] . ' </td>
                            <td>' . $row["description"] . ' </td>
                            <td><button class = "btn edit btn-success" id = "' . $row["SNo"] . '" ><i class="fas fa-edit"></i> Edit</button> 
                            <button class = "btn delete btn-danger" id = "d' . $row["SNo"].'"><i class="fas fa-trash-alt"></i> Delete</button></td>
                           
                        </tr>';
                        $counter = $counter + 1;
                    }

                    ?>


                </tbody>
            </table>
        </div>






        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="//cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>


        <script>
            $(document).ready(function() {
                $('#myTable').DataTable();
            });
        </script>
        <script>
            document.querySelectorAll('.edit').forEach(item => {
                item.addEventListener("click", (e) => {
                    console.log("edit ");
                    tr = e.target.parentNode.parentNode;
                    title = tr.getElementsByTagName("td")[0].innerText;
                    description = tr.getElementsByTagName("td")[1].innerText;
                    console.log(title, description);
                    titleEdit.value = title;
                    descriptionEdit.value = description;
                    snoEdit.value = e.target.id;
                    console.log(e.target.id)
                    $('#editModal').modal('toggle');
                })
            })

            document.querySelectorAll('.delete').forEach(item => {
                item.addEventListener("click", (e) => {
                    console.log("delete ");
                    sno = e.target.id.substr(1,);
                    console.log(sno);

                    if(confirm("Do you really want to delete this note ?")){
                        window.location = `index.php?delete=${sno}`;
                    }
                   
                })
            })
        </script>

</body>

</html>