#! /usr/bin/python

import os
import shutil
import pprint
import argparse

CURRENT_DIR = os.path.dirname(os.path.realpath(__file__))
REFERENCE_PROJECT_NAME = "Reference"

if __name__ == '__main__':

    parser = argparse.ArgumentParser(description='Builds a new top coder project submission.')

    parser.add_argument('-pn', '--project-name', required=True,
                        help='Specifies the project name')

    args = parser.parse_args()

    pathToNewProject = os.path.join(CURRENT_DIR, args.project_name)
    if os.path.exists(pathToNewProject):
        print "Must choose a project name that does not exist."
        exit (-1)

    pathToReference = os.path.join(CURRENT_DIR, REFERENCE_PROJECT_NAME)
    try:
        shutil.copytree(pathToReference, pathToNewProject)
    except Exception, e:
        print "Failed to copy reference: %s" %e
        exit (-2)

    for root, dirs, files in os.walk(pathToNewProject):
        for d in dirs:
            if d == "reference":
                pathToDirectory = os.path.join(root, "reference")
                pathToRenamedDirectory = os.path.join(root, args.project_name.lower())
                os.rename(pathToDirectory, pathToRenamedDirectory)

    for root, dirs, files in os.walk(pathToNewProject):
        for f in files:
            if "Reference" in f:
                pathToFile = os.path.join(root, f)
                newFileName = f.replace("Reference", args.project_name)
                pathToRenamedFile = os.path.join(root, newFileName)
                os.rename(pathToFile, pathToRenamedFile)
