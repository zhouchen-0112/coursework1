int[] average_grades(int grades[][], int weights[]) {
    int numStudents = grades.length;                
    int numComponents = weights.length;             
    int[] averages = new int[numStudents];          

    for (int i = 0; i < numStudents; i++) {         
        int totalWeightedScore = 0;
        
        for (int j = 0; j < numComponents; j++) {   
            totalWeightedScore += grades[i][j] * weights[j];
        }
        
        averages[i] = totalWeightedScore / 100;     
    }
    
    return averages;
}