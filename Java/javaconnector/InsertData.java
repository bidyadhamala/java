<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banker's Algorithm for Resource Allocation</title>
    <script>
        function startProgram() {
            let resources = [];
            let processes = [];
            let allocation = [];
            let maxNeed = [];
            let avail = [];

            
            let numResources = parseInt(prompt("Enter number of resources:"));
            let numProcesses = parseInt(prompt("Enter number of processes:"));

        
            resources = [];
            for (let i = 0; i < numResources; i++) {
                resources[i] = parseInt(prompt("Enter resource " + (i + 1) + " value:"));
            }

    
            allocation = [];
            maxNeed = [];
            for (let i = 0; i < numProcesses; i++) {
                allocation[i] = [];
                maxNeed[i] = [];
                for (let j = 0; j < numResources; j++) {
                    allocation[i][j] = parseInt(prompt("Enter allocation for Process " + (i + 1) + ", Resource " + (j + 1) + ":"));
                    maxNeed[i][j] = parseInt(prompt("Enter max need for Process " + (i + 1) + ", Resource " + (j + 1) + ":"));
                }
            }

            
            avail = resources.slice(); 
            for (let i = 0; i < numProcesses; i++) {
                for (let j = 0; j < numResources; j++) {
                    avail[j] -= allocation[i][j];
                }
            }

        
            function isSafeState() {
                let finish = Array(numProcesses).fill(false);
                let safeSeq = [];
                let work = avail.slice(); // copy of avail

                while (safeSeq.length < numProcesses) {
                    let foundProcess = false;

                    for (let i = 0; i < numProcesses; i++) {
                        if (!finish[i]) {
                            let canAllocate = true;
                            for (let j = 0; j < numResources; j++) {
                                if (maxNeed[i][j] - allocation[i][j] > work[j]) {
                                    canAllocate = false;
                                    break;
                                }
                            }

                            if (canAllocate) {
                                safeSeq.push(i + 1);
                                for (let j = 0; j < numResources; j++) {
                                    work[j] += allocation[i][j];
                                }
                                finish[i] = true;
                                foundProcess = true;
                                break;
                            }
                        }
                    }

                    if (!foundProcess) {
                        return false; // No safe sequence found, system is not in a safe state
                    }
                }

                alert("Safe Sequence: " + safeSeq.join(", "));
                return true;
            }

            
            if (isSafeState()) {
                alert("The system is in a safe state.");
            } else {
                alert("The system is not in a safe state.");
            }

            
            let newRequest = confirm("Do you want to check a new request?");
            if (newRequest) {
                let newProcess = parseInt(prompt("Enter Process number (1 to " + numProcesses + "):")) - 1;
                let request = [];
                for (let i = 0; i < numResources; i++) {
                    request[i] = parseInt(prompt("Enter the request for Resource " + (i + 1) + ":"));
                }

                
                let validRequest = true;
                for (let i = 0; i < numResources; i++) {
                    if (request[i] > maxNeed[newProcess][i] - allocation[newProcess][i] || request[i] > avail[i]) {
                        validRequest = false;
                        break;
                    }
                }

                if (validRequest) {
                    
                    let tempAvail = avail.slice();
                    let tempAlloc = allocation.slice();
                    let tempMaxNeed = maxNeed.slice();

                    for (let i = 0; i < numResources; i++) {
                        tempAvail[i] -= request[i];
                        tempAlloc[newProcess][i] += request[i];
                    }

                    if (isSafeState()) {
                        alert("Request is granted and the system is still in a safe state.");
                    } else {
                        alert("Request is denied to avoid unsafe state.");
                    }
                } else {
                    alert("Request is denied due to invalid request.");
                }
            }

            // Stop the program
            alert("Program stopped.");
        }
    </script>
</head>
<body>
    <h1>Banker's Algorithm</h1>
    <button onclick="startProgram()">Start Program</button>
</body>
</html>