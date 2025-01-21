function calculatePriority() {
    // Получаем значения из выпадающих списков
    const ic = parseInt(document.getElementById("ic").value);
    const fp = parseInt(document.getElementById("fp").value);
    const f = parseInt(document.getElementById("f").value);
    
    // Рассчитываем приоритет
    const priority = (ic * 4) + (fp * 3) + (f * 2);
    
    // Отображаем результат в элементе с id "result"
    document.getElementById("result").textContent = priority;
}