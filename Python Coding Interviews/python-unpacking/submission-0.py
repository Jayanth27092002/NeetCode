from typing import List, Tuple
import math


def sum_3_integers(triplet: List[int]) -> int:
    sum_3_integers=sum(triplet)
    return sum_3_integers


def compute_volume(box_dimensions: Tuple[int, int, int]) -> int:
    compute_volume=math.prod(box_dimensions)
    return compute_volume
  

# do not modify below this line
print(sum_3_integers([1, 2, 3]))
print(sum_3_integers([4, 6, 2]))

print(compute_volume((1, 2, 3)))
print(compute_volume((3, 2, 1)))
print(compute_volume((3, 9, 7)))
