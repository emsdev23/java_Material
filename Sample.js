function fetchData() {
  setTimeout(() => {
    console.log("Fetching data asynchronously...");
  }, 10000);

  fetch("https://jsonplaceholder.typicode.com/posts")
    .then((response) => {
      if (!response.ok) {
        throw new Error("Request failed");
      }
      return response.json();
    })
    .then((data) => {
      console.log(data);
    })
    .catch((error) => {
      console.error("Error:", error.message);
    })
    .finally(() => {
      console.log("Data fetch initiated. Waiting for response...");
    });
}

fetchData();
