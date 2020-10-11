object Solution {
  def main(args: Array[String]): Unit = {
    //    println(permute(Array(1, 1, 2)))
    //    println(permuteUnique(Array(1, 1,2,2)))
    //    println(trap(Array(0,1,0,2,1,0,1,3,2,1,2,1)))
    //
    //    val node1 = new ListNode(1)
    //    val node2 = new ListNode(0)
    //    val node3 = new ListNode(1)
    //
    //    node1.next = node2
    //    node2.next = node3
    //
    //    println(getDecimalValue(node1))

    //    println(rob(Array(1,2,3,1)))

    //    println(combinationSum(Array(2, 7, 6, 3, 5, 1), 9))

    //    (1 to 10).foreach(i => println(countAndSay(i)))

    //    val n1 = new ListNode(0)
    //    val n2 = new ListNode(1)
    //    val n3 = new ListNode(2)
    //    val n4 = new ListNode(3)
    //    n1.next = n2
    //    n2.next = n3
    //    n3.next = n4
    //    n4.next = n2
    //
    //    println(hasCycle(n1))
    //    println(hasCycle(null))

    //    println(findMaximizedCapital(2, 0, Array(10, 2, 3), Array(0, 1, 1)))

//    val heap = new scala.collection.mutable.PriorityQueue[(Int, Int)]()(Ordering.by(a => a._1 - a._2))
//    heap += ((3, 1))
//    heap += ((2, 2))
//    heap += ((5, 3))
//    heap += ((8, 4))
//    heap += ((1, 5))
//    while(heap.nonEmpty) println(heap.dequeue())
//
//    println(findMaximizedCapital(
//      111,
//      12,
//      Array(319, 178, 37, 756, 152, 763, 481, 1055, 594, 825, 759, 494, 1087, 696, 717, 358, 1091, 1145, 1043, 245, 779, 957, 3, 1060, 1141, 926, 226, 657, 869, 740, 1170, 746, 889, 416, 634, 209, 1189, 1076, 819, 1144, 40, 807, 561, 400, 283, 133, 186, 839, 1043, 491, 936, 559, 70, 9, 854, 1172, 9, 739, 871, 436, 1087, 1029, 66, 561, 798, 1141, 701, 1020, 1072, 92, 636, 509, 392, 77, 84, 202, 843, 563, 329, 906, 101, 997, 1162, 105, 876, 460, 285, 446, 753, 516, 60, 932, 323, 659, 9, 639, 1041, 861, 1199, 343, 792, 1114, 536, 405, 542, 805, 929, 589, 538, 410, 143, 114, 24, 1064, 682, 536, 1016, 1141, 843, 472, 817, 196, 673, 189, 915, 196, 755, 203, 956, 283, 833, 836, 22, 899, 232, 655, 572, 207, 819, 639, 1024, 887, 407, 385, 251, 896, 165, 290, 193, 357, 870, 678, 411, 697, 998, 344, 628, 866, 1004, 894, 547, 574, 36, 847, 691, 601, 896, 363, 21, 1133, 115, 658, 855, 1042, 2, 189, 230, 215, 747, 971, 581, 809, 832, 311, 35, 639, 1127, 701, 167, 672, 763, 997, 1061, 1170, 289, 806, 91, 198, 720, 67, 273, 863, 437, 152, 671, 635, 968, 107, 58, 453, 392, 236, 875, 719, 44, 850, 176, 580, 937, 227, 125, 851, 1188, 915, 747, 1175, 69, 743, 250, 275, 290, 787, 780, 516, 775, 279, 256, 649, 83, 1180, 372, 655, 813, 750, 381, 807, 988, 977, 430, 282, 1067, 551, 726, 756, 372, 17, 1016, 550, 1128, 223, 174, 85, 1039, 1, 27, 178, 822, 243, 440, 79, 772, 211, 640, 454, 1141, 654, 351, 54, 794, 711, 157, 492, 307, 1156, 937, 212, 461, 417, 741, 1104, 642, 1147, 833, 1194, 1066, 1070, 876, 1045, 341, 854, 1014, 787, 518, 404, 1068, 385, 756, 998, 298, 439, 917, 183, 71, 363, 38, 828, 372, 1071, 195, 481, 1153, 871, 712, 803, 849, 145, 1144, 410, 420, 561, 678, 241, 498, 548, 436, 871, 810, 180, 635, 119, 665, 551, 1132, 807, 408, 685, 489, 274, 459, 28, 987, 935, 310, 284, 1163, 924, 812, 267, 1123, 782, 1065, 1075, 1199, 1047, 289, 280, 1044, 931, 1056, 625, 672, 150, 41, 1084, 998, 151, 483, 226, 548, 277, 1187, 1010, 262, 1048, 493, 1084, 845, 1127, 1009, 773, 129, 547, 798, 118, 559, 463, 972, 666, 1155, 519, 381, 405, 819, 201, 790, 729, 1100, 614, 691, 3, 386, 206, 514, 387, 612, 1073, 158, 67, 1116, 164, 496, 1056, 1159, 348, 530, 28, 1177, 774, 1139, 559, 563, 310, 916, 897, 36, 1060, 173, 952, 123, 635, 911, 711, 304, 611, 481, 645, 532, 1033, 385, 402, 797, 117, 307, 969, 1147, 1127, 434, 1099, 1043, 104, 74, 257, 778, 934, 901, 106, 84, 525, 138, 698, 877, 1009, 487, 450, 649, 736, 802, 1032, 456, 757, 10, 2, 720, 1155, 234, 844, 880, 1053, 1134, 821, 1094, 970, 1095, 976, 101, 1163, 104, 38, 198, 350, 896, 345, 867, 1129, 1064, 403, 228, 1103, 416, 561, 722, 915, 1161, 252, 45, 632, 1163, 232, 174, 964, 876, 1126, 479, 432, 984, 815, 544, 1005, 620, 497, 1021, 763, 169, 1028, 706, 1112, 150, 368, 483, 251, 721, 492, 686, 1105, 38, 1140, 1085, 153, 366, 428, 296, 28, 648, 873, 21, 236, 393, 581, 1043, 1086, 747, 402, 201, 1196, 416, 788, 318, 257, 815, 735, 1023, 1143, 1100, 922, 1033, 884, 824, 963, 159, 904, 21, 1168, 511, 723, 400, 239, 338, 89, 1099, 572, 674, 54, 891, 426, 277, 91, 504, 302, 616, 468, 506, 917, 491, 744, 1091, 1051, 594, 465, 850, 338, 417, 320, 1160, 364, 480, 855, 86, 305, 225, 833, 637, 760, 1147, 613, 236, 460, 664, 1183, 38, 806, 100, 654, 852, 975, 816, 506, 1092, 275, 6, 229, 972, 53, 554, 370, 63, 651, 701, 304, 1011, 672, 353, 118, 1111, 448, 549, 151, 1087, 909, 420, 1095, 663, 1119, 1124, 729, 578, 733, 861, 1154, 1195, 387, 1182, 850, 189, 463, 1129, 1185, 541, 546, 1159, 314, 137, 479, 59, 841, 514, 548, 496, 642, 341, 151, 999, 1036, 1186, 704, 550, 1039, 723, 779, 584, 382, 371, 712, 176, 665, 180, 440, 697, 1102, 408, 728, 157, 1050, 558, 692, 336, 384, 107, 839, 477, 204, 862, 345, 429, 1144, 1069, 207, 449, 594, 963, 988, 843, 334, 200, 865, 281, 296, 1040, 914, 995, 743, 1134, 1050, 484, 602, 1001, 570, 1052, 1106, 922, 77, 1099, 681, 360, 955, 1184, 669, 411, 760, 46, 599, 815, 231, 86, 694, 469, 1079, 1161, 1105, 519, 1010, 681, 603, 376, 534, 145, 361, 448, 1006, 91, 397, 671, 597, 238, 119, 467, 587, 723, 162, 804, 638, 568, 195, 460, 610, 868, 806, 995, 1178, 490, 406, 933, 232, 17, 37, 2, 114, 1004, 871, 531, 209, 267, 37, 750, 1196, 940, 89, 725, 377, 898, 6, 685, 210, 1127, 1160, 432, 391, 931, 681, 937, 275, 1190, 137, 743, 652, 430, 566, 180, 1192, 718, 253, 133, 998, 1067, 764, 747, 1159, 827, 143, 506, 641, 327, 468, 731, 50, 15, 569, 80, 310, 1086, 1092, 989, 245, 520, 711, 788, 1144, 938, 1152, 1169, 563, 1053, 1182, 331, 838, 112, 361, 1049, 717, 979, 956, 434, 534, 1083, 117, 280, 1104, 293, 1137, 592, 1019, 606, 526, 216, 924, 197, 137, 1041, 2, 910, 274, 1178, 267, 521, 626, 764, 691, 124, 446, 337, 676, 325, 288, 1120, 924, 512, 777, 1063, 979, 86, 677, 1183, 777, 418, 41, 852, 929, 712, 1132, 1030, 339, 943, 475, 851, 340, 894, 1091, 230, 654, 229, 945, 69, 182, 110, 255, 895, 645, 1061, 793, 1016, 807, 440, 330, 519, 73, 108, 660, 209, 1077, 1191, 938, 415, 1162, 579, 258, 14, 273, 561, 834, 371, 134, 1118, 1139, 1163, 667, 979, 483, 436, 42, 593, 139, 846, 875, 571, 808, 76, 713, 1198, 352, 299, 156, 793, 509, 245, 697, 1106, 236, 287, 236, 644, 683),
//      Array(487, 13, 943, 31, 661, 656, 690, 175, 1147, 760, 96, 290, 755, 504, 1111, 219, 187, 641, 380, 886, 781, 214, 714, 594, 41, 1154, 908, 977, 1183, 28, 464, 524, 895, 1177, 28, 225, 1180, 206, 387, 25, 166, 207, 394, 418, 771, 719, 153, 836, 970, 589, 114, 67, 1180, 1136, 863, 1144, 21, 9, 957, 861, 981, 849, 1031, 361, 541, 649, 220, 718, 263, 390, 24, 830, 103, 955, 233, 1174, 521, 580, 83, 869, 321, 712, 1011, 130, 297, 835, 406, 543, 849, 681, 337, 355, 867, 863, 552, 883, 155, 762, 982, 129, 605, 125, 1111, 442, 89, 1139, 1084, 870, 183, 1142, 78, 12, 893, 677, 817, 348, 1036, 482, 76, 619, 563, 435, 529, 311, 1148, 629, 786, 288, 112, 995, 854, 844, 1002, 948, 570, 736, 1088, 354, 618, 876, 926, 150, 1108, 412, 707, 233, 137, 775, 751, 1137, 481, 349, 150, 518, 1165, 191, 223, 754, 419, 1025, 817, 1001, 278, 692, 403, 1023, 106, 78, 124, 679, 598, 727, 1026, 966, 564, 726, 1148, 643, 806, 1182, 645, 300, 867, 613, 458, 844, 679, 907, 437, 1012, 902, 18, 843, 190, 43, 705, 818, 957, 146, 1175, 130, 744, 941, 975, 692, 1066, 541, 335, 20, 311, 606, 377, 558, 113, 545, 1115, 228, 29, 2, 1180, 331, 1072, 151, 692, 1156, 347, 293, 1135, 959, 865, 1031, 40, 425, 1191, 1178, 87, 989, 92, 1186, 1072, 105, 1058, 369, 401, 1117, 220, 484, 181, 901, 321, 923, 263, 72, 685, 820, 1123, 736, 942, 37, 419, 631, 545, 761, 227, 230, 25, 636, 1048, 834, 736, 899, 530, 217, 669, 278, 653, 657, 857, 724, 782, 146, 780, 615, 1156, 751, 463, 625, 707, 355, 92, 718, 855, 624, 504, 359, 744, 793, 868, 462, 985, 1087, 517, 886, 83, 221, 383, 601, 709, 683, 1097, 544, 411, 28, 1129, 781, 13, 752, 347, 1150, 1030, 269, 701, 658, 658, 1188, 222, 1160, 480, 953, 203, 132, 17, 723, 927, 911, 448, 977, 1126, 219, 118, 1033, 919, 1041, 712, 930, 963, 772, 264, 523, 479, 735, 919, 72, 1019, 131, 15, 628, 331, 408, 578, 37, 1123, 125, 527, 887, 54, 1043, 259, 654, 557, 872, 505, 700, 1077, 202, 368, 628, 29, 66, 199, 611, 730, 1108, 682, 705, 628, 1001, 705, 21, 266, 428, 1093, 800, 742, 701, 715, 845, 1151, 300, 460, 1134, 708, 443, 706, 819, 296, 199, 671, 452, 626, 386, 569, 999, 326, 1081, 202, 384, 783, 541, 811, 1058, 684, 146, 288, 1149, 480, 0, 658, 547, 773, 588, 758, 189, 489, 257, 436, 362, 417, 180, 671, 141, 657, 864, 808, 1026, 504, 827, 1125, 977, 1161, 699, 360, 689, 520, 796, 147, 746, 978, 833, 82, 102, 254, 736, 88, 525, 1037, 659, 1061, 333, 663, 520, 6, 439, 823, 1151, 395, 188, 32, 513, 34, 805, 1017, 1193, 157, 942, 87, 630, 915, 807, 215, 482, 1132, 23, 1008, 1175, 724, 1070, 339, 1139, 22, 455, 306, 369, 151, 1031, 1119, 846, 1195, 49, 1169, 773, 706, 45, 747, 875, 944, 1161, 1025, 258, 765, 1039, 459, 641, 1169, 211, 894, 556, 253, 831, 1115, 458, 351, 1138, 58, 1169, 1190, 743, 611, 392, 1015, 54, 831, 330, 1138, 681, 1012, 750, 967, 1179, 398, 564, 5, 2, 143, 787, 197, 590, 144, 589, 588, 493, 524, 748, 1123, 707, 585, 641, 293, 871, 331, 1173, 280, 218, 931, 11, 663, 1005, 1118, 555, 1000, 699, 720, 81, 527, 71, 458, 462, 1056, 447, 491, 1068, 1078, 842, 455, 497, 959, 745, 654, 1011, 939, 787, 430, 535, 594, 940, 1176, 656, 207, 815, 1133, 610, 1113, 596, 1018, 961, 840, 555, 582, 1187, 828, 161, 983, 686, 870, 800, 525, 34, 1013, 385, 870, 953, 59, 518, 521, 151, 633, 561, 848, 310, 712, 108, 1148, 446, 480, 983, 110, 442, 182, 119, 463, 909, 690, 48, 1040, 631, 17, 1027, 158, 353, 108, 524, 335, 1046, 514, 1027, 746, 917, 378, 437, 606, 829, 743, 462, 1013, 525, 290, 477, 749, 896, 12, 351, 13, 42, 819, 334, 912, 30, 1041, 815, 307, 1138, 168, 209, 1134, 100, 276, 292, 283, 1074, 123, 561, 857, 92, 879, 58, 706, 532, 75, 49, 385, 342, 887, 646, 301, 54, 483, 589, 1084, 1092, 178, 845, 243, 873, 611, 340, 712, 115, 157, 63, 773, 800, 844, 167, 384, 522, 877, 183, 368, 709, 501, 905, 512, 756, 246, 197, 463, 47, 232, 256, 37, 883, 1048, 774, 431, 943, 868, 111, 163, 336, 648, 313, 858, 536, 416, 680, 951, 320, 499, 199, 234, 482, 529, 676, 26, 1180, 721, 877, 586, 628, 1152, 835, 1145, 447, 763, 750, 188, 1169, 596, 1125, 310, 519, 1165, 488, 1063, 59, 292, 701, 1078, 1088, 663, 512, 172, 477, 187, 215, 1192, 22, 827, 279, 607, 286, 179, 744, 569, 500, 510, 1038, 570, 1159, 520, 1070, 759, 831, 906, 644, 753, 574, 257, 983, 1023, 227, 460, 710, 169, 595, 249, 111, 73, 991, 933, 448, 655, 559, 183, 244, 44, 644, 935, 466, 97, 605, 460, 800, 229, 977, 675, 236, 946, 73, 456, 623, 499, 423, 162, 342, 914, 386, 1082, 407, 954, 1081, 1099, 142, 539, 416, 791, 1195, 1099, 885, 965, 971, 796, 1198, 449, 768, 792, 541, 18, 476, 303, 137, 319, 1008, 343, 733, 128, 641, 709, 175, 691, 227, 307, 1177, 1198, 1075, 747, 944, 1038, 933, 643, 613, 1166, 1153, 120, 288, 1167, 246, 1103, 185, 85, 1008, 1060, 1051, 421, 150, 601, 376, 183, 1028, 146, 297, 515, 688, 886, 1090, 552, 969, 903, 1086, 931, 946, 1099, 546, 17, 851, 908, 1170, 418, 94, 61, 233, 1069, 510, 783, 302, 701, 564, 1195, 57, 1007, 994, 205, 1019, 694, 1020, 137, 1041, 803, 673, 1162, 14, 904, 418, 1076, 514, 79, 944, 242, 491, 867, 934, 40, 1059, 776, 817, 468, 516, 550, 906, 790, 459, 273, 924, 185, 1183, 337, 435, 699, 316, 768)
//    ))



  }


  /**
    * Input: k=2, W=0, Profits=[1,2,3], Capital=[0,1,1].
    *
    * Output: 4
    *
    * Explanation: Since your initial capital is 0, you can only start the project indexed 0.
    * After finishing it you will obtain profit 1 and your capital becomes 1.
    * With capital 1, you can either start the project indexed 1 or the project indexed 2.
    * Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
    * Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/ipo
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param k
    * @param W
    * @param Profits
    * @param Capital
    * @return
    */
  def findMaximizedCapital(k: Int, W: Int, Profits: Array[Int], Capital: Array[Int]): Int = {

    var res: Int = W
    if (W >= Capital.max) {
      val heap = new scala.collection.mutable.PriorityQueue[Int]()
      heap ++= Profits
      // top k profits
      (1 to k).foreach((_: Int) => res += heap.dequeue())
    }
    else {
      // sort by capital ascending
      val projects = new scala.collection.mutable.PriorityQueue[(Int, Int)]()(Ordering.fromLessThan((t1: (Int, Int), t2: (Int, Int)) => t1._2 > t2._2))
      projects ++= Profits.zip(Capital)
      // sort by available profits descending
      val available = new scala.collection.mutable.PriorityQueue[Int]()

      var i = 0
      while (i < k) {
        // find available profits
        while (projects.nonEmpty && projects.head._2 <= res) available += projects.dequeue()._1
        // add maximum profit
        if (available.nonEmpty) res += available.dequeue()
        // no available profits
        else i = k
        i += 1
      }
    }
    res
  }

  /**
    * Given head, the head of a linked list, determine if the linked list has a cycle in it.
    * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
    * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
    * Return true if there is a cycle in the linked list. Otherwise, return false.
    *
    * Follow up:
    * Can you solve it using O(1) (i.e. constant) memory?
    *
    * Input: head = [3,2,0,-4], pos = 1
    * Output: true
    * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/linked-list-cycle
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param head
    * @return
    */
  def hasCycle(head: ListNode): Boolean = {
    if (head == null || head.next == null) return false
    var fast: ListNode = head.next
    var slow: ListNode = head

    while (fast != slow) {
      if (fast == null || fast.next == null) return false

      fast = fast.next.next
      slow = slow.next
    }

    true
  }


  /**
    * 1 is read off as "one 1" or 11.
    * 11 is read off as "two 1s" or 21.
    * 21 is read off as "one 2, then one 1" or 1211.
    *
    * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
    * You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
    *
    * Note: Each term of the sequence of integers will be represented as a string.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/count-and-say
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param n
    * @return
    */
  def countAndSay(n: Int): String = {

    def count(s: String): String = {
      var say = ""
      var cnt = 1
      var c: Char = s(0)
      var i = 1
      while (i < s.length) {
        if (s(i) == c) cnt += 1
        else {
          say += cnt.toString + c
          c = s(i)
          cnt = 1
        }
        i += 1
      }
      say += cnt.toString + c
      say
    }

    var say = "1"
    var i = 1
    while (i < n) {
      say = count(say)
      i += 1
    }
    say
  }

  /**
    * Write a function that reverses a string. The input string is given as an array of characters char[].
    * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    * You may assume all the characters consist of printable ascii characters.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/reverse-string
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param s
    */
  def reverseString(s: Array[Char]): Unit = {

    var i = 0
    var j: Int = s.length - 1
    var tmp: Char = ' '
    while (i < j) {
      tmp = s(i)
      s(i) = s(j)
      s(j) = tmp

      i += 1
      j -= 1
    }
    s.reverse
  }


  /**
    * Given two arrays of integers nums1 and nums2, return the number of triplets formed (type 1 and type 2) under the following rules:
    *
    * Type 1: Triplet (i, j, k) if nums1[i]^2 == nums2[j] * nums2[k] where 0 <= i < nums1.length and 0 <= j < k < nums2.length.
    * Type 2: Triplet (i, j, k) if nums2[i]^2 == nums1[j] * nums1[k] where 0 <= i < nums2.length and 0 <= j < k < nums1.length.
    *  
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param nums1
    * @param nums2
    * @return
    */
  def numTriplets(nums1: Array[Int], nums2: Array[Int]): Int = {

    def triplets(nums1: Array[Int], nums2: Array[Int]): Int = {
      var square: Map[Long, Int] = Map()
      nums1.foreach((num: Int) => {
        val sq: Long = num * num.toLong
        square ++= Map(sq -> (1 + square.getOrElse(sq, 0)))
      })
      var i = 0
      var cnt = 0
      while (i < nums2.length - 1) {
        var j: Int = i + 1
        while (j < nums2.length) {
          val s: Long = nums2(i) * nums2(j).toLong
          if (square.keySet.contains(s)) cnt += square(s)
          j += 1
        }
        i += 1
      }

      cnt
    }

    triplets(nums1, nums2) + triplets(nums2, nums1)
  }


  /**
    * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
    * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
    * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
    *
    * Example 1:
    *
    * Input: candidates = [2,3,6,7], target = 7
    * Output: [[2,2,3],[7]]
    * Explanation:
    * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    * 7 is a candidate, and 7 = 7.
    * These are the only two combinations.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/combination-sum
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param candidates
    * @param target
    * @return
    */
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {

    // sort the candidates to make sure they are increasing
    //    scala.util.Sorting.quickSort(candidates)
    val candidatesSorted: Array[Int] = candidates.sorted
    var combinations: List[List[Int]] = List[List[Int]]()

    // backtracking
    def helper(i: Int, remain: Int, res: List[Int]): Unit = {
      // exit
      if (i > candidatesSorted.length - 1) return

      // look up candidates
      var j: Int = i
      while (j < candidatesSorted.length) {
        remain - candidatesSorted(j) match {
          // pruning
          case d if d < 0 => j = candidatesSorted.length
          // match target
          case d if d == 0 => combinations = (candidatesSorted(j) :: res) :: combinations
          // keep searching
          case d if d > 0 => helper(j, d, candidatesSorted(j) :: res)
        }
        j += 1
      }
    }

    helper(0, target, Nil)
    combinations
  }

  /**
    * You are a professional robber planning to rob houses along a street.
    * Each house has a certain amount of money stashed.
    * All houses at this place are arranged in a circle.
    * That means the first house is the neighbor of the last one.
    * Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
    *
    * Given a list of non-negative integers nums representing the amount of money of each house,
    * return the maximum amount of money you can rob tonight without alerting the police.
    * Input: nums = [1,2,3,1]
    * Output: 4
    * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    * Total amount you can rob = 1 + 3 = 4.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/house-robber-ii
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param nums
    * @return
    */
  def rob(nums: Array[Int]): Int = {
    if (nums.length == 1) return nums(0)
    val n: Int = nums.length

    val dp: Array[Int] = Array.ofDim[Int](n)

    // rob without last
    dp(0) = nums(0)
    dp(1) = math.max(nums(0), nums(1))
    var i = 2
    while (i < n - 1) {
      dp(i) = math.max(dp(i - 1), dp(i - 2) + nums(i))
      i += 1
    }
    val max1 = dp(n - 2)

    // rob without head
    dp(0) = 0
    dp(1) = nums(1)
    i = 2
    while (i < n) {
      dp(i) = math.max(dp(i - 1), dp(i - 2) + nums(i))
      i += 1
    }

    math.max(max1, dp(n - 1))
  }

  /**
    * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
    *
    * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
    * Return the decimal value of the number in the linked list.
    * Input: head = [1,0,1]
    * Output: 5
    * Explanation: (101) in base 2 = (5) in base 10
    *
    * @param head
    * @return
    */
  def getDecimalValue(head: ListNode): Int = {
    var node: ListNode = head
    var s = 0
    while (node != null) {
      s = (s << 1) + node.x
      node = node.next
    }
    s
  }

  /**
    * https://leetcode-cn.com/problems/trapping-rain-water/
    * Given n non-negative integers representing an elevation map where the width of each bar is 1,
    * compute how much water it is able to trap after raining.
    *
    * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
    * Output: 6
    *
    * @param height array of heights
    * @return
    */
  def trap(height: Array[Int]): Int = {
    if (height.length <= 2) return 0
    var water = 0
    var h1 = 0
    var h2 = 0
    var i = 0
    while (i < height.length) {

      h1 = math.max(h1, height(i))
      h2 = math.max(h2, height(height.length - i - 1))
      water = water + h1 + h2
      i += 1
    }

    water - height.length * h1 - height.sum
  }


  /**
    * https://leetcode.com/problems/permutations-ii/
    * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
    *
    * @param nums
    * @return
    */
  def permuteUnique(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) return List(List[Int]())
    scala.util.Sorting.quickSort(nums)

    @scala.annotation.tailrec
    def permuteUnique(pos: Int, permutaion: List[List[Int]]): List[List[Int]] = {
      if (pos >= nums.length) return permutaion
      val num: Int = nums(pos)
      var result = List[List[Int]]()
      permutaion.foreach(
        (list: List[Int]) => {
          var jumped = false
          for (i <- 0 until pos + 1) {
            if (nums(i) != num) {
              jumped = false
              result = result ::: List(
                list.take(i) ::: List(num) ::: list.takeRight(pos - i)
              )
            }
            else if (!jumped) {
              jumped = true
              result = result ::: List(list.take(i) ::: List(num) ::: list.takeRight(pos - i))
            }

          }
        }

      )
      permuteUnique(pos + 1, result)
    }

    permuteUnique(1, List(List(nums(0)))).toList
  }

  /**
    * https://leetcode.com/problems/permutations/
    * Given a collection of distinct integers, return all possible permutations.
    *
    * @param nums
    * @return
    */
  def permute(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) return List(List[Int]())

    @scala.annotation.tailrec
    def permute(pos: Int, permutaion: List[List[Int]]): List[List[Int]] = {
      if (pos >= nums.length) return permutaion
      val num: Int = nums(pos)
      var result = List[List[Int]]()
      permutaion.foreach(
        (list: List[Int]) =>
          for (i <- 0 until pos + 1) {
            result = result ::: List(
              list.take(i) ::: List(num) ::: list.takeRight(pos - i)
            )
          }
      )
      permute(pos + 1, result)
    }

    permute(1, List(List(nums(0))))
  }

  /**
    * https://leetcode.com/problems/valid-sudoku/
    * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    *
    * Each row must contain the digits 1-9 without repetition.
    * Each column must contain the digits 1-9 without repetition.
    * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    *
    * @param board
    * @return
    */
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val grid = Array.ofDim[Boolean](3, 3, 9)

    for (i <- 0 until 9) {
      val existRow = Array.ofDim[Boolean](9)
      val existCol = Array.ofDim[Boolean](9)
      for (j <- 0 until 9) {
        val (x, y) = (i / 3, j / 3)
        if (board(i)(j) != '.') {
          val k: Int = board(i)(j).toInt - 49
          if (!existRow(k)) existRow(k) = true
          else return false
          if (!grid(x)(y)(k)) grid(x)(y)(k) = true
          else return false
        }
        if (board(j)(i) != '.') {
          val k = board(j)(i).toInt - 49
          if (!existCol(k)) existCol(k) = true
          else return false
        }
      }
    }
    true
  }

  /**
    * https://leetcode.com/problems/implement-strstr/
    *
    * @param haystack
    * @param needle
    * @return
    */
  def strStr(haystack: String, needle: String): Int = {
    val l: Int = needle.length
    var head = 0
    while (head + l <= haystack.length) {
      if (haystack.substring(head, head + l) == needle) return head
      head += 1
    }
    -1
  }

  /**
    * https://leetcode.com/problems/container-with-most-water/
    * Given n non-negative integers a1, a2, ..., an ,
    * where each represents a point at coordinate (i, ai).
    * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
    * Find two lines, which together with x-axis forms a container,
    * such that the container contains the most water.
    *
    * @param height
    * @return
    */
  def maxArea(height: Array[Int]): Int = {
    var max = 0
    //    for (i <- height.indices){
    //      val curH: Int = height(i)
    //      if (curH > 0) {
    //        val maxI: Int = i - max / curH
    //        for (j <- 0 until maxI) {
    //          val c: Int = (i - j) * math.min(curH, height(j))
    //          max = math.max(max, c)
    //        }
    //      }
    //    }
    var left = 0
    var right: Int = height.length - 1
    while (left < right) {
      max =
        math.max(max, math.min(height(left), height(right)) * (right - left))
      if (height(left) < height(right)) {
        left += 1
      } else {
        right -= 1
      }

    }
    max
  }

  /**
    * https://leetcode.com/problems/search-insert-position/
    * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    *
    * You may assume no duplicates in the array.
    *
    * @param nums
    * @param target
    * @return
    */
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var i = 0
    nums.foreach((n: Int) => {
      if (n < target) {
        i += 1
      } else {
        return i
      }
    })
    i
  }

  /**
    * https://leetcode.com/problems/merge-k-sorted-lists/
    * Merge k sorted linked lists and return it as one sorted list.
    * Analyze and describe its complexity.
    *
    * @param lists sorted lists
    * @return
    */
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if (lists.isEmpty) return null
    if (lists.length == 1) return lists(0)
    if (lists.length == 2) return mergeTwoLists(lists(0), lists(1))
    var l: ListNode = lists.head
    lists.tail.foreach((list: ListNode) => {
      l = mergeTwoLists(l, list)
    })
    l
  }

  /**
    * https://leetcode.com/problems/merge-two-sorted-lists/
    * Merge two sorted linked lists and return it as a new list.
    * The new list should be made by splicing together the nodes of the first two lists.
    * * Definition for singly-linked list.
    * * class ListNode(var _x: Int = 0) {
    * *   var next: ListNode = null
    * *   var x: Int = _x
    * * }
    *
    * @param l1 l1
    * @param l2 l2
    * @return
    */
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2
    if (l2 == null) return l1
    var curl1: ListNode = l1
    var curl2: ListNode = l2
    val l: ListNode = if (curl1._x <= curl2._x) {
      val begin: Int = curl1._x
      curl1 = curl1.next
      new ListNode(begin)
    } else {
      val begin: Int = curl2._x
      curl2 = curl2.next
      new ListNode(begin)
    }

    var curl: ListNode = l
    while (curl1 != null && curl2 != null) {
      if (curl1._x <= curl2._x) {
        curl.next = new ListNode(curl1._x)
        curl = curl.next
        curl1 = curl1.next
      } else {
        curl.next = new ListNode(curl2._x)
        curl = curl.next
        curl2 = curl2.next
      }
    }
    while (curl1 != null) {
      curl.next = new ListNode(curl1._x)
      curl = curl.next
      curl1 = curl1.next
    }
    while (curl2 != null) {
      curl.next = new ListNode(curl2._x)
      curl = curl.next
      curl2 = curl2.next
    }
    l
  }

  /**
    * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
    * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    * Input: "23"
    * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    *
    * @param digits like "234234"
    * @return
    */
  def letterCombinations(digits: String): List[String] = {
    if (digits.length == 0) return List()
    val queue = new scala.collection.mutable.Queue[String]
    val alpha = new scala.collection.mutable.HashMap[Char, List[String]]
    alpha.put('2', List("a", "b", "c"))
    alpha.put('3', List("d", "e", "f"))
    alpha.put('4', List("g", "h", "i"))
    alpha.put('5', List("j", "k", "l"))
    alpha.put('6', List("m", "n", "o"))
    alpha.put('7', List("p", "q", "r", "s"))
    alpha.put('8', List("t", "u", "v"))
    alpha.put('9', List("w", "x", "y", "z"))
    if (digits.length == 1) return alpha(digits(0))
    queue ++= alpha(digits(0))
    digits
      .substring(1)
      .foreach((c: Char) => {
        var l: Int = queue.length
        while (l > 0) {
          val head: String = queue.dequeue()
          queue ++= alpha(c).map((a: String) => head + a)
          l -= 1
        }
      })
    queue.toList
  }

  /**
    * https://leetcode.com/problems/palindrome-number/
    * Determine whether an integer is a palindrome.
    * An integer is a palindrome when it reads the same backward as forward.
    * Input: 121
    * Output: true
    *
    * @param x like 121
    * @return
    */
  def isPalindrome(x: Int): Boolean = {
    if (x < 0) return false
    val s = x.toString
    s == s.reverse
  }

  /**
    * https://leetcode.com/problems/3sum/
    * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
    * Find all unique triplets in the array which gives the sum of zero.
    * fixed a and then the problem is a 2sum problem
    */
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val threesum = scala.collection.mutable.Set[List[Int]]()
    scala.util.Sorting.quickSort(nums)
    if (nums.length < 3) {
      return threesum.toList
    }
    if (nums.count((r: Int) => r == 0) >= 3) threesum += List(0, 0, 0)
    if (!nums.exists((r: Int) => r > 0)) return threesum.toList
    if (!nums.exists((r: Int) => r < 0)) return threesum.toList

    var i = 0
    while (i < nums.length - 2) {
      val a: Int = nums(i)
      var j: Int = i + 1
      var k: Int = nums.length - 1
      while (j < k) {
        val sum: Int = -nums(j) - nums(k)
        if (sum < a) {
          k -= 1
        } else if (sum > a) {
          j += 1
        } else {
          val b: Int = nums(j)
          val c: Int = nums(k)
          threesum += List(a, b, c)

          while (j < k && nums(j) == b) j += 1
          //          while (j < k && nums(k) == c) k -= 1

        }
      }
      while (i + 1 < nums.length && nums(i) == nums(i + 1)) i += 1
      i += 1
    }
    threesum.toList
  }
}
