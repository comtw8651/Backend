const canvas = document.getElementById('gameCanvas');
const ctx = canvas.getContext('2d');

async function fetchAnimals() {
  const res = await fetch('/api/animals');
  return await res.json();
}

function drawAnimal(animal) {
  const img = new Image();
  img.src = `/images/${animal.type}.png`; // 例如 cat.png
  img.onload = () => {
    ctx.drawImage(img, animal.x, animal.y, 50, 50);
  };
}

async function render() {
  ctx.clearRect(0, 0, canvas.width, canvas.height);
  const animals = await fetchAnimals();
  animals.forEach(drawAnimal);
}

setInterval(render, 1000);