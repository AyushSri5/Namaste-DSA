// Optimised approach TC: O(n) SC: O(1)
function findLargest(arr) {
  // your solution here
  if (!Array.isArray(arr))
    return false;
  if (arr.length == 0)
    return null;
  let max = -999999999;
  for (let i = 0; i < arr.length; i++){
    if (!Number.isFinite(arr[i]))
      return false;
      max = Math.max(max, arr[i]);
  }
  return max;
}

module.exports = { findLargest };
