package com.afs.unittest;

import com.afs.unittest.exception.UnexpectedProjectTypeException;
import com.afs.unittest.expense.ExpenseType;
import com.afs.unittest.Project.Project;
import com.afs.unittest.Project.ProjectType;

import static com.afs.unittest.expense.ExpenseType.*;

class ExpenseService {
    ExpenseType getExpenseCodeByProjectTypeAndName(Project project) throws UnexpectedProjectTypeException {
        ProjectType projectType = project.getProjectType();
        if(projectType == ProjectType.INTERNAL){
            return INTERNAL_PROJECT_EXPENSE;
        }else{
            if(projectType == ProjectType.EXTERNAL){
                String projectName = project.getProjectName();
                if(projectName.equals("Project A")){
                    return EXPENSE_TYPE_A;
                }

                if(projectName.equals("Project B")){
                    return EXPENSE_TYPE_B;
                }

                return OTHER_EXPENSE;
            }

            throw new UnexpectedProjectTypeException("You enter invalid project type");
        }
    }
}
